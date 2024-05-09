package generator;

import antlr4.GrammarBaseListener;
import antlr4.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.regex.Pattern;

public class Listener extends GrammarBaseListener {

    private final Map<String, Pattern> tokens = new HashMap<>();
    private final List<Pattern> skip = new ArrayList<>();
    private final Set<String> terminals = new HashSet<>();
    private final Map<String, Rule> rules = new HashMap<>();
    private String grammarName;
    private String startTerminal;
    private final String packageName;

    public Listener(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public void exitNameGrammar(GrammarParser.NameGrammarContext ctx) {
        grammarName = ctx.TOKEN().getText();
    }

    @Override
    public void exitStartTerm(GrammarParser.StartTermContext ctx) {
        startTerminal = ctx.TOKEN().getText();
        terminals.add(startTerminal);
    }

    @Override
    public void exitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx) {
        String terminal = ctx.TOKEN().getText();
        terminals.add(terminal);
        List<Variant> variants = getVariants(ctx.variants());
        Rule rule = new Rule(getArgs(ctx.arguments()),
                getReturnType(ctx.returnType()), variants);
        rules.put(terminal, rule);

    }

    private Map<String, String> getArgs(GrammarParser.ArgumentsContext ctx) {
        List<GrammarParser.ArgumentContext> argumentsContext = ctx == null ? List.of() : ctx.argument();
        Map<String, String> arguments = new HashMap<>();
        for (GrammarParser.ArgumentContext argument : argumentsContext) {
            gerArg(argument, arguments);
        }
        return arguments;
    }

    private void gerArg(GrammarParser.ArgumentContext ctx, Map<String, String> arguments) {
        arguments.put(ctx.type().getText(), ctx.argName().getText());
    }

    private String getReturnType(GrammarParser.ReturnTypeContext ctx) {
        if (ctx == null) return null;
        return ctx.nameClass().getText();
    }

    private List<Variant> getVariants(GrammarParser.VariantsContext ctx) {
        List<GrammarParser.VariantContext> variantsContext = ctx.variant();
        List<Variant> variants = new ArrayList<>();
        for (GrammarParser.VariantContext variant : variantsContext) {
            getVariant(variant, variants);
        }
        return variants;
    }

    private void getVariant(GrammarParser.VariantContext ctx, List<Variant> variants) {
        List<GrammarParser.TermContext> termContext = ctx.term();
        List<Term> terms = new ArrayList<>();
        String returnTerm = ctx.returnTerm() != null ? getReturnTerm(ctx.returnTerm()) : null;
        for (GrammarParser.TermContext termContex : termContext) {
            terms.add(getTerm(termContex));
        }
        Variant variant = new Variant(terms, returnTerm);
        variants.add(variant);
    }

    private Term getTerm(GrammarParser.TermContext ctx) {
        String def = ctx.DEF() == null ? null : getDef(ctx.DEF());
        return new Term(ctx.TOKEN().getText(), getAttrs(ctx.attrs()), def);
    }

    private List<String> getAttrs(GrammarParser.AttrsContext ctx) {
        List<GrammarParser.AttrContext> attrsContext = ctx == null ? List.of() : ctx.attr();
        List<String> attrs = new ArrayList<>();
        for (GrammarParser.AttrContext attr : attrsContext) {
            getAttr(attr, attrs);
        }
        return attrs;
    }

    private void getAttr(GrammarParser.AttrContext ctx, List<String> attrs) {
        attrs.add(ctx.NAME().getText());
    }

    private String getReturnTerm(GrammarParser.ReturnTermContext ctx) {
        if (ctx.TOKEN() != null) {
            return ctx.TOKEN().getText();
        }
        return getDef(ctx.DEF());
    }

    private String getDef(TerminalNode node) {
        String str = node.getText();
        return str.substring(1, str.length() - 1);
    }

    @Override
    public void exitLexicalAnalyzerRule(GrammarParser.LexicalAnalyzerRuleContext ctx) {
        if (ctx.TOKEN() != null) {
            tokens.put(ctx.TOKEN().getText(), getToken(ctx.token()));
            return;
        }
        skip.add(getToken(ctx.token()));
    }

    private Pattern getToken(GrammarParser.TokenContext ctx) {
        if (ctx.STRING() != null) {
            String str = ctx.STRING().getText();
            return Pattern.compile(Pattern.quote(str.substring(1, str.length() - 1)));
        }
        String str = ctx.REGEX().getText();
        return Pattern.compile(str.substring(1, str.length() - 1));
    }

    public Map<String, Pattern> getTokens() {
        return tokens;
    }

    public List<Pattern> getSkip() {
        return skip;
    }

    public Map<String, Rule> getRules() {
        return rules;
    }

    public String getGrammarName() {
        return grammarName;
    }

    public String getStartTerminal() {
        return startTerminal;
    }

    public String getPackageName() {
        return packageName;
    }

    public Set<String> getTerminals() {
        return terminals;
    }
}
