package logic;

import base.BaseLexicalAnalyzer;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class LogicLexicalAnalyzer extends BaseLexicalAnalyzer<LogicToken> {
  public LogicLexicalAnalyzer(String curString) {
    super(createMapTokens(), createListSkip(), curString, LogicToken.END);
  }

  private static Map<LogicToken, Pattern> createMapTokens() {
    Map<LogicToken, Pattern> tokens = new HashMap<>();
    tokens.put(LogicToken.IMPL, Pattern.compile("\\Q->\\E"));
    tokens.put(LogicToken.NOT, Pattern.compile("\\Qnot\\E"));
    tokens.put(LogicToken.OR, Pattern.compile("\\Qor\\E"));
    tokens.put(LogicToken.VAR, Pattern.compile("[a-z]"));
    tokens.put(LogicToken.AND, Pattern.compile("\\Qand\\E"));
    tokens.put(LogicToken.LPAREN, Pattern.compile("\\Q(\\E"));
    tokens.put(LogicToken.XOR, Pattern.compile("\\Qxor\\E"));
    tokens.put(LogicToken.RPAREN, Pattern.compile("\\Q)\\E"));
    return tokens;
  }

  private static List<Pattern> createListSkip() {
    List<Pattern> skip = new ArrayList<>();
    skip.add(Pattern.compile("[ \\t\\n\\r]"));
    return skip;
  }
}
