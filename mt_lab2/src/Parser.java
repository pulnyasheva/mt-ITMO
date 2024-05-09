import java.text.ParseException;

public class Parser {
    LexicalAnalyzer lexicalAnalyzer;

    private Tree P() throws ParseException {
        switch (lexicalAnalyzer.getCurToken()) {
            case VAR -> {
                lexicalAnalyzer.nextToken();
                return new Tree("P", new Tree(Token.VAR.name()));
            }
            case LPAREN -> {
                lexicalAnalyzer.nextToken();
                Tree s = S();
                if (lexicalAnalyzer.getCurToken() == Token.RPAREN) {
                    lexicalAnalyzer.nextToken();
                    return new Tree("P", new Tree("("), s, new Tree(")"));
                } else {
                    throw createParserError("Expected closing parenthesis");
                }
            }
            case NOT -> {
                lexicalAnalyzer.nextToken();
                return new Tree("P", new Tree(Token.NOT.name()), P());
            }
            default -> throw createParserError("Unknown token");
        }
    }

    private Tree FPrime() throws ParseException {
        if (lexicalAnalyzer.getCurToken() == Token.AND) {
            lexicalAnalyzer.nextToken();
            return new Tree("F'", new Tree(Token.AND.name()), P(), FPrime());
        }
        return new Tree("F'", new Tree("Eps"));
    }

    private Tree F() throws ParseException {
        return new Tree("F", P(), FPrime());
    }

    private Tree TPrime() throws ParseException {
        if (lexicalAnalyzer.getCurToken() == Token.XOR) {
            lexicalAnalyzer.nextToken();
            return new Tree("T'", new Tree(Token.XOR.name()), F(), TPrime());
        }
        return new Tree("T'", new Tree("Eps"));
    }

    private Tree T() throws ParseException {
        return new Tree("T", F(), TPrime());
    }

    private Tree EPrime() throws ParseException {
        if (lexicalAnalyzer.getCurToken() == Token.OR) {
            lexicalAnalyzer.nextToken();
            return new Tree("E'", new Tree(Token.OR.name()), T(), EPrime());
        }
        return new Tree("E'", new Tree("Eps"));
    }

    private Tree E() throws ParseException {
        return new Tree("E", T(), EPrime());
    }

    private Tree SPrime() throws ParseException {
        if (lexicalAnalyzer.getCurToken() == Token.ANSWER) {
            lexicalAnalyzer.nextToken();
            Tree s1 = S();
            if (lexicalAnalyzer.getCurToken() == Token.COLON) {
                lexicalAnalyzer.nextToken();
                Tree s2 = S();
                return new Tree("S'", new Tree("?"), s1, new Tree(":"), s2);
            } else {
                throw createParserError("Expected closing parenthesis");
            }
        }
        return new Tree("S'", new Tree("Eps"));
    }

    private Tree S() throws ParseException {
        return new Tree("S", E(), SPrime());
    }

    public Tree parse(String str) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(str);
        lexicalAnalyzer.nextToken();
        Tree e = S();
        if (lexicalAnalyzer.getCurToken() != Token.END) {
            throw createParserError("Unknown token");
        }
        return e;
    }

    private ParseException createParserError(String message) {
        return new ParseException(message, lexicalAnalyzer.getCurPos());
    }
}