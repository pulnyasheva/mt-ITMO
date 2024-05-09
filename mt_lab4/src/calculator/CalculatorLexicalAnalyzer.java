package calculator;

import base.BaseLexicalAnalyzer;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CalculatorLexicalAnalyzer extends BaseLexicalAnalyzer<CalculatorToken> {
  public CalculatorLexicalAnalyzer(String curString) {
    super(createMapTokens(), createListSkip(), curString, CalculatorToken.END);
  }

  private static Map<CalculatorToken, Pattern> createMapTokens() {
    Map<CalculatorToken, Pattern> tokens = new HashMap<>();
    tokens.put(CalculatorToken.DIV, Pattern.compile("\\Q/\\E"));
    tokens.put(CalculatorToken.NUMBER, Pattern.compile("[0-9.]+"));
    tokens.put(CalculatorToken.MUL, Pattern.compile("\\Q*\\E"));
    tokens.put(CalculatorToken.LPAREN, Pattern.compile("\\Q(\\E"));
    tokens.put(CalculatorToken.RPAREN, Pattern.compile("\\Q)\\E"));
    tokens.put(CalculatorToken.PLUS, Pattern.compile("\\Q+\\E"));
    tokens.put(CalculatorToken.MINUS, Pattern.compile("\\Q-\\E"));
    return tokens;
  }

  private static List<Pattern> createListSkip() {
    List<Pattern> skip = new ArrayList<>();
    skip.add(Pattern.compile("[ \\t\\n\\r]"));
    return skip;
  }
}
