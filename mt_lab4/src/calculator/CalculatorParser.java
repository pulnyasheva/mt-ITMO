package calculator;

import generator.ParseException;
import java.lang.String;

public class CalculatorParser {
  private CalculatorLexicalAnalyzer lexicalAnalyzer;

  public double parse(String str) {
    lexicalAnalyzer = new CalculatorLexicalAnalyzer(str);
    lexicalAnalyzer.nextToken();
    double e = E();
    if (lexicalAnalyzer.getCurToken() != CalculatorToken.END) {
      throw new ParseException("Expected END", lexicalAnalyzer.getCurPos());
    }
    return e;
  }

  private String checkToken(CalculatorToken token) {
    if (lexicalAnalyzer.getCurToken() != token) {
      throw new ParseException("Expected " + token, lexicalAnalyzer.getCurPos());
    }
    String valueString = lexicalAnalyzer.getCurValueString();
    lexicalAnalyzer.nextToken();
    return valueString;
  }

  private double EPrime(double num) {
    switch (lexicalAnalyzer.getCurToken()) {
      case PLUS ->  {
        CalculatorToken PLUS = lexicalAnalyzer.getCurToken();
        String plus = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        double t = T();
        double res = num + t;
        double ePrime = EPrime(res);
        return ePrime;
      }
      case MINUS ->  {
        CalculatorToken MINUS = lexicalAnalyzer.getCurToken();
        String minus = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        double t = T();
        double res = num - t;
        double ePrime = EPrime(res);
        return ePrime;
      }
      case END, RPAREN -> {
        return num;
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private double T() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NUMBER, LPAREN ->  {
        double f = F();
        double tPrime = TPrime(f);
        return tPrime;
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private double E() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NUMBER, LPAREN ->  {
        double t = T();
        double ePrime = EPrime(t);
        return ePrime;
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private double F() {
    switch (lexicalAnalyzer.getCurToken()) {
      case NUMBER ->  {
        CalculatorToken NUMBER = lexicalAnalyzer.getCurToken();
        String number = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        return Double.parseDouble(number);
      }
      case LPAREN ->  {
        CalculatorToken LPAREN = lexicalAnalyzer.getCurToken();
        String lparen = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        double e = E();
        CalculatorToken RPAREN = lexicalAnalyzer.getCurToken();
        String rparen = checkToken(CalculatorToken.RPAREN);
        return e;
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }

  private double TPrime(double num) {
    switch (lexicalAnalyzer.getCurToken()) {
      case MUL ->  {
        CalculatorToken MUL = lexicalAnalyzer.getCurToken();
        String mul = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        double f = F();
        double res = num * f;
        double tPrime = TPrime(res);
        return tPrime;
      }
      case DIV ->  {
        CalculatorToken DIV = lexicalAnalyzer.getCurToken();
        String div = lexicalAnalyzer.getCurValueString();
        lexicalAnalyzer.nextToken();
        double f = F();
        double res = num / f;
        double tPrime = TPrime(res);
        return tPrime;
      }
      case END, RPAREN, PLUS, MINUS -> {
        return num;
      }
      default -> {
        throw new ParseException("Unknown token", lexicalAnalyzer.getCurPos());
      }
    }
  }
}
