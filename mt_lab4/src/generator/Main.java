package generator;

import antlr4.GrammarLexer;
import antlr4.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        generateClasses("calculator", "calculator.gr");
        generateClasses("logic", "logic.gr");
    }

    private static void generateClasses(String packageName, String fileGrammar) throws IOException {
        Lexer lexer = new GrammarLexer(
                CharStreams.fromPath(
                        Path.of("src/" + packageName + "/" + fileGrammar), StandardCharsets.UTF_8));
        ParseTree tree = new GrammarParser(new CommonTokenStream(lexer)).program();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener(packageName);
        walker.walk(listener, tree);

        GenEnumToken genEnumToken = new GenEnumToken(listener);
        GenLexicalAnalyzer genLexicalAnalyzer = new GenLexicalAnalyzer(listener);
        GenParser genParser = new GenParser(listener);

        String tokenName = packageName + "/" + listener.getGrammarName() + "Token.java";
        String analyzerName = packageName + "/" + listener.getGrammarName() + "LexicalAnalyzer.java";
        String parserName = packageName + "/" + listener.getGrammarName() + "Parser.java";

        FileWriter tokenWriter = new FileWriter("src/" + tokenName, StandardCharsets.UTF_8);
        BufferedWriter writer = new BufferedWriter(tokenWriter);
        writer.write(genEnumToken.generate().build().toString());
        writer.close();

        FileWriter analyzerWriter = new FileWriter("src/" + analyzerName, StandardCharsets.UTF_8);
        writer = new BufferedWriter(analyzerWriter);
        writer.write(genLexicalAnalyzer.generate().build().toString());
        writer.close();

        FileWriter parserWriter = new FileWriter("src/" + parserName, StandardCharsets.UTF_8);
        writer = new BufferedWriter(parserWriter);
        writer.write(genParser.generate().build().toString());
        writer.close();
    }
}