package generator;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.util.*;
import java.util.regex.Pattern;

public class GenParser {
    private final Map<String, Pattern> tokens;
    private final Set<String> terminals;
    private final Map<String, Rule> rules;
    private final String startTerminal;
    private final String parserName;
    private final String analyzerName;
    private final String tokenName;
    private final String packageName;
    private final String eps = "EPS";
    private final Map<String, Set<String>> first = new HashMap<>();
    private final Map<String, Set<String>> follow = new HashMap<>();

    public GenParser(Listener listener) {
        this.tokens = listener.getTokens();
        this.terminals = listener.getTerminals();
        this.rules = listener.getRules();
        this.startTerminal = listener.getStartTerminal();
        this.packageName = listener.getPackageName();
        parserName = listener.getGrammarName() + "Parser";
        analyzerName = listener.getGrammarName() + "LexicalAnalyzer";
        tokenName = listener.getGrammarName() + "Token";
        firstMap();
        followMap();
    }

    private void firstMap() {
        for (String terminal : terminals) {
            first.put(terminal, new HashSet<>());
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, Rule> entry : rules.entrySet()) {
                String terminal = entry.getKey();
                List<Variant> variants = entry.getValue().variants();
                for (Variant variant : variants) {
                    List<String> nextTerms = variant.terms().stream()
                            .map(Term::name).toList();
                    changed = changed || addTermFirstMap(terminal, nextTerms.get(0));
                    int index = 1;
                    boolean hasEps = hasEps(nextTerms.get(0));
                    while (index < nextTerms.size() && hasEps) {
                        changed = changed || addTermFirstMap(terminal, nextTerms.get(index));
                        hasEps = hasEps(nextTerms.get(index));
                        index = index + 1;
                    }
                }
            }
        }
    }

    private void followMap() {
        for (String terminal : terminals) {
            follow.put(terminal, new HashSet<>());
        }
        String end = "END";
        follow.get(startTerminal).add(end);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, Rule> entry : rules.entrySet()) {
                String terminal = entry.getKey();
                List<Variant> variants = entry.getValue().variants();
                for (Variant variant : variants) {
                    List<String> nextTerms = variant.terms().stream()
                            .map(Term::name).toList();
                    for (int i = 0; i < nextTerms.size(); i++) {
                        String nextTerm = nextTerms.get(i);
                        if (isTerminal(nextTerm)) {
                            if (i < nextTerms.size() - 1) {
                                Set<String> firstTokens = first(nextTerms.subList(i + 1, nextTerms.size()));
                                boolean hasEps = firstTokens.contains(eps);
                                firstTokens.remove(eps);
                                changed = changed || follow.get(nextTerm).addAll(firstTokens);
                                if (hasEps) {
                                    changed = changed || follow.get(nextTerm).addAll(follow.get(terminal));
                                }
                            } else {
                                changed = changed || follow.get(nextTerm).addAll(follow.get(terminal));
                            }
                        }
                    }
                }
            }
        }
    }

    private Set<String> first(List<String> terms) {
        Set<String> firstTokens = new HashSet<>();
        addTerm(terms.get(0), firstTokens);
        int index = 1;
        boolean hasEps = hasEps(terms.get(0));
        while (index < terms.size() && hasEps) {
            addTerm(terms.get(index), firstTokens);
            hasEps = hasEps(terms.get(index));
            index = index + 1;
        }
        return firstTokens;
    }

    private void addTerm(String term, Set<String> firstTokens) {
        if (term.equals(eps)) {
            firstTokens.add(eps);
            return;
        }
        if (tokens.containsKey(term)) {
            firstTokens.add(term);
            return;
        }
        firstTokens.addAll(first.get(term));
    }

    private boolean addTermFirstMap(String terminal, String term) {
        if (term.equals(eps)) return first.get(terminal).add(eps);
        if (tokens.containsKey(term)) return first.get(terminal).add(term);
        return first.get(terminal).addAll(first.get(term));
    }

    private boolean hasEps(String term) {
        if (tokens.containsKey(term)) return false;
        if (term.equals(eps)) return true;
        return first.get(term).contains(eps);
    }

    private boolean isTerminal(String term) {
        return terminals.contains(term);
    }

    private boolean isToken(String term) {
        return tokens.containsKey(term);
    }

    public JavaFile.Builder generate() {
        return JavaFile.builder(packageName, genClass());
    }

    private TypeSpec genClass() {
        TypeSpec.Builder type = TypeSpec.classBuilder(parserName)
                .addModifiers(Modifier.PUBLIC)
                .addField(FieldSpec.builder(
                        ClassName.get(packageName, analyzerName),
                        "lexicalAnalyzer",
                        Modifier.PRIVATE
                ).build())
                .addMethod(genMethodParser())
                .addMethod(genMethodCheckToken());
        for (Map.Entry<String, Rule> entry : rules.entrySet()) {
            type.addMethod(genMethodTerminal(entry.getKey(), entry.getValue()));
        }
        return type.build();
    }

    private MethodSpec genMethodTerminal(String terminal, Rule rule) {
        MethodSpec.Builder method =
                MethodSpec.methodBuilder(terminal)
                        .addModifiers(Modifier.PRIVATE);
        addParameters(method, rule);
        addReturn(method, rule);
        method.beginControlFlow("switch (lexicalAnalyzer.getCurToken())");
        for (Variant variant : rule.variants()) {
            addCase(method, variant, terminal);
        }
        addDefaultCase(method);
        method.endControlFlow();

        return method.build();
    }

    private void addDefaultCase(MethodSpec.Builder method) {
        method.beginControlFlow("default ->");
        addException(method, "\"Unknown token\"");
        method.endControlFlow();
    }


    private void addCase(MethodSpec.Builder method, Variant variant, String terminal) {
        List<Term> terms = variant.terms();
        String firstTerm = variant.terms().get(0).name();
        if (firstTerm.equals(eps)) {
            if (variant.returnDef() != null) {
                Set<String> followTokens = follow.get(terminal);
                String tokensCase = String.join(", ", followTokens);
                method.beginControlFlow("case $L ->", tokensCase);
                method.addStatement("return $L", variant.returnDef());
            }
            method.endControlFlow();
            return;
        }
        int index = 0;
        if (isToken(firstTerm)) {
            method.beginControlFlow("case $L -> ", firstTerm);
            method.addStatement("$T $L = lexicalAnalyzer.getCurToken()", ClassName.get(packageName, tokenName),
                    firstTerm);
            method.addStatement("$T $L = lexicalAnalyzer.getCurValueString()", String.class,
                    firstTerm.toLowerCase());
            method.addStatement("lexicalAnalyzer.nextToken()");
            index += 1;
        }
        if (isTerminal(firstTerm)) {
            Set<String> firstTokens = first(terms.stream().map(Term::name).toList());
            if (firstTokens.contains(eps)) {
                firstTokens.addAll(follow.get(firstTerm));
            }
            String tokensCase = String.join(", ", firstTokens);
            method.beginControlFlow("case $L -> ", tokensCase);
        }
        while (index < terms.size()) {
            addCodeTerm(method, terms.get(index));
            index += 1;
        }
        if (variant.returnDef() != null) {
            String returnName = getReturnDef(variant.returnDef());
            method.addStatement("return $L", returnName);
        }
        method.endControlFlow();
    }

    private String getReturnDef(String str){
        return isTerminal(str)
                ? toLowerCaseFirst(str) : str;
    }

    private String toLowerCaseFirst(String str) {
        String firstLetter = str.substring(0, 1).toLowerCase();
        String restLetters = str.substring(1);
        return firstLetter + restLetters;
    }

    private void addCodeTerm(MethodSpec.Builder method, Term term) {
        if (isToken(term.name())) {
            method.addStatement("$T $L = lexicalAnalyzer.getCurToken()", ClassName.get(packageName, tokenName),
                    term.name());
            method.addStatement("$T $L = checkToken($T.$L)", String.class,
                    term.name().toLowerCase(),
                    ClassName.get(packageName, tokenName),
                    term.name());
        } else {
            if (term.defArgs() != null) {
                method.addStatement(term.defArgs());
            }
            String args = "";
            if (term.args() != null) {
                args = "(" + String.join(", ", term.args()) + ")";
            }
            String returnTypeTerm = rules.get(term.name()).returnType();
            if (returnTypeTerm != null) {
                method.addStatement("$T $L = $L$L", getType(returnTypeTerm), toLowerCaseFirst(term.name()),
                        term.name(), args);
            }
        }
    }

    private void addParameters(MethodSpec.Builder method, Rule rule) {
        for (Map.Entry<String, String> entry : rule.args().entrySet()) {
            method.addParameter(getType(entry.getKey()), entry.getValue());
        }
    }

    private void addReturn(MethodSpec.Builder method, Rule rule) {
        if (rule.returnType() != null) method.returns(getType(rule.returnType()));
    }

    private MethodSpec genMethodParser() {
        MethodSpec.Builder method =
                MethodSpec.methodBuilder("parse")
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(String.class, "str")
                        .addStatement("lexicalAnalyzer = new $T(str)", ClassName.get(packageName, analyzerName))
                        .addStatement("lexicalAnalyzer.nextToken()");
        if (rules.get(startTerminal).returnType() != null) {
            Class<?> returnType = getType(rules.get(startTerminal).returnType());
            method.returns(returnType);
            method.addStatement("$T $L = $L()", returnType, toLowerCaseFirst(startTerminal), startTerminal);
        } else {
            method.addStatement("$L()", startTerminal);
        }
        method.beginControlFlow("if (lexicalAnalyzer.getCurToken() != $T.END)",
                ClassName.get(packageName, tokenName));
        addException(method, "\"Expected END\"");
        method.endControlFlow();
        if (rules.get(startTerminal).returnType() != null) {
            method.addStatement("return $L", toLowerCaseFirst(startTerminal));
        }
        return method.build();
    }

    private MethodSpec genMethodCheckToken() {
        MethodSpec.Builder method =
                MethodSpec.methodBuilder("checkToken")
                        .returns(String.class)
                        .addModifiers(Modifier.PRIVATE)
                        .addParameter(ClassName.get(packageName, tokenName), "token");
        method.beginControlFlow("if (lexicalAnalyzer.getCurToken() != token)");
        addException(method, "\"Expected \" + token");
        method.endControlFlow();
        method.addStatement("$T valueString = lexicalAnalyzer.getCurValueString()", String.class);
        method.addStatement("lexicalAnalyzer.nextToken()");
        method.addStatement("return valueString");
        return method.build();
    }

    private void addException(MethodSpec.Builder method, String message) {
        method.addStatement("throw new $T($L, lexicalAnalyzer.getCurPos())",
                ParseException.class,
                message);
    }

    private Class<?> getType(String type) {
        switch (type) {
            case "int" -> {
                return int.class;
            }
            case "double" -> {
                return double.class;
            }
            case "boolean" -> {
                return boolean.class;
            }
            default -> {
                try {
                    return Class.forName(type);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            }
        }
    }
}
