package logic;

import generator.ParseException;
import java.lang.String;

public class LogicParser {
  private LogicLexicalAnalyzer lexicalAnalyzer;

  public Tree parse(String str) {
    lexicalAnalyzer = new LogicLexicalAnalyzer(str);
    lexicalAnalyzer.nextToken();
    Tree s = S();
    if (lexicalAnalyzer.getCurToken() != LogicToken.END) {
      throw new ParseException("Expected END", lexicalAnalyzer.getCurPos());
    }
    return s;
  }

  private String checkToken(LogicToken token) {
    if (lexicalAnalyzer.getCurToken() != token) {
      throw new ParseException("Expected " + token, lexicalAnalyzer.getCurPos());
    }
    String valueString = lexicalAnalyzer.getCurValueString();
    lexicalAnalyzer.nextToken();
    return valueString;
  }

  private Tree P() {
    switch (lexicalAnalyzer.getCurToken()) {
      case VAR ->  {
        LogicToken VAR = lexicalAnalyzer.getCurToken();
        String var = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        return new logic.Tree("P", new logic.Tree(VAR.name()));
      }
      case LPAREN ->  {
        LogicToken LPAREN = lexicalAnalyzer.getCurToken();
        String lparen = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree e = E();
        LogicToken RPAREN = lexicalAnalyzer.getCurToken();
        String rparen = checkToken(LogicToken.RPAREN);
        return new Tree("P",  new logic.Tree(lparen), e, new logic.Tree(rparen));
      }
      case NOT ->  {
        LogicToken NOT = lexicalAnalyzer.getCurToken();
        String not = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree p = P();
        return new logic.Tree("P", new logic.Tree(NOT.name()), p);
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree EPrime() {
    switch (lexicalAnalyzer.getCurToken()) {
      case OR ->  {
        LogicToken OR = lexicalAnalyzer.getCurToken();
        String or = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree t = T();
        Tree ePrime = EPrime();
        return new logic.Tree("E'", new logic.Tree(OR.name()), t, ePrime);
      }
      case IMPL, END, RPAREN -> {
        return new logic.Tree("E'", new logic.Tree("Eps"));
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree SPrime() {
    switch (lexicalAnalyzer.getCurToken()) {
      case IMPL ->  {
        LogicToken IMPL = lexicalAnalyzer.getCurToken();
        String impl = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree e = E();
        Tree sPrime = SPrime();
        return new logic.Tree("S'", new logic.Tree(IMPL.name()), e, sPrime);
      }
      case END -> {
        return new logic.Tree("S'", new logic.Tree("Eps"));
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree S() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NOT, VAR, LPAREN ->  {
        Tree e = E();
        Tree sPrime = SPrime();
        return new logic.Tree("S", e, sPrime);
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree T() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NOT, VAR, LPAREN ->  {
        Tree f = F();
        Tree tPrime = TPrime();
        return new logic.Tree("T", f, tPrime);
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree E() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NOT, VAR, LPAREN ->  {
        Tree t = T();
        Tree ePrime = EPrime();
        return new logic.Tree("E", t, ePrime);
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree F() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NOT, VAR, LPAREN ->  {
        Tree p = P();
        Tree fPrime = FPrime();
        return new logic.Tree("F", p, fPrime);
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree FPrime() {
    switch (lexicalAnalyzer.getCurToken()) {
      case AND ->  {
        LogicToken AND = lexicalAnalyzer.getCurToken();
        String and = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree p = P();
        Tree fPrime = FPrime();
        return new logic.Tree("F'", new logic.Tree(AND.name()), p, fPrime);
      }
      case IMPL, OR, XOR, END, RPAREN -> {
        return new logic.Tree("F'", new logic.Tree("Eps"));
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private Tree TPrime() {
    switch (lexicalAnalyzer.getCurToken()) {
      case XOR ->  {
        LogicToken XOR = lexicalAnalyzer.getCurToken();
        String xor = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        Tree f = F();
        Tree tPrime = TPrime();
        return new logic.Tree("T'", new logic.Tree(XOR.name()), f, tPrime);
      }
      case IMPL, OR, END, RPAREN -> {
        return new logic.Tree("T'", new logic.Tree("Eps"));
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }
}
