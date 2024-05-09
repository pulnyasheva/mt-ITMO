package generator;

import base.BaseLexicalAnalyzer;
import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GenLexicalAnalyzer {
    private final Map<String, Pattern> tokens;
    private final List<Pattern> skip;
    private final String analyzerName;
    private final String tokenName;
    private final String packageName;

    public GenLexicalAnalyzer(Listener listener) {
        this.tokens = listener.getTokens();
        this.skip = listener.getSkip();
        this.packageName = listener.getPackageName();
        analyzerName = listener.getGrammarName() + "LexicalAnalyzer";
        tokenName = listener.getGrammarName() + "Token";
    }

    public JavaFile.Builder generate() {
        return JavaFile.builder(packageName, genClass());
    }

    private TypeSpec genClass() {
        return TypeSpec.classBuilder(analyzerName)
                .addModifiers(Modifier.PUBLIC)
                .addMethod(genConstructor())
                .superclass(ParameterizedTypeName.get(
                        ClassName.get(BaseLexicalAnalyzer.class),
                        ClassName.get(packageName,  tokenName)
                ))
                .addMethod(genMethodCreateMapTokens())
                .addMethod(genMethodCreateListSkip())
                .build();
    }

    private MethodSpec genConstructor() {
        return MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(String.class, "curString")
                .addStatement("super(createMapTokens(), createListSkip(), curString, " + tokenName + ".END)")
                .build();
    }

    private MethodSpec genMethodCreateMapTokens(){
        ParameterizedTypeName type = ParameterizedTypeName.get(ClassName.get(Map.class),
                ClassName.get(packageName,  tokenName),
                ClassName.get(Pattern.class));

        MethodSpec.Builder method =
                MethodSpec.methodBuilder("createMapTokens")
                        .returns(type)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                        .addStatement("$T tokens = new $T<>()", type, ClassName.get(HashMap.class));

        for (Map.Entry<String, Pattern> entry : tokens.entrySet()) {
            method.addStatement("tokens.put($L.$L, Pattern.compile($S))", tokenName,
                    entry.getKey(),
                    entry.getValue());
        }

        method.addStatement("return tokens");
        return method.build();
    }

    private MethodSpec genMethodCreateListSkip(){
        ParameterizedTypeName type = ParameterizedTypeName.get(ClassName.get(List.class),
                ClassName.get(Pattern.class));

        MethodSpec.Builder method =
                MethodSpec.methodBuilder("createListSkip")
                        .returns(type)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                        .addStatement("$T skip = new $T<>()", type, ClassName.get(ArrayList.class));

        for (Pattern pattern : skip) {
            method.addStatement("skip.add(Pattern.compile($S))", pattern);
        }

        method.addStatement("return skip");
        return method.build();
    }
}
