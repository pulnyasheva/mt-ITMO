package generator;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.util.Set;

public class GenEnumToken {
    private final Set<String> tokens;
    private final String packageName;
    private final String name;

    public GenEnumToken(Listener listener) {
        this.tokens = listener.getTokens().keySet();
        this.packageName = listener.getPackageName();
        name = listener.getGrammarName() + "Token";
    }

    public JavaFile.Builder generate() {
        TypeSpec.Builder enumBuilder = TypeSpec.enumBuilder(name)
                .addModifiers(Modifier.PUBLIC);

        for (String token : tokens) {
            enumBuilder.addEnumConstant(token);
        }
        enumBuilder.addEnumConstant("END");

        TypeSpec enumType = enumBuilder.build();

        return JavaFile.builder(packageName, enumType);
    }
}
