import java.util.Map;

public enum Token {
    AND, OR, XOR, NOT, LPAREN, RPAREN, VAR, END, ANSWER, COLON;

    static final Map<String, Token> tokenMap = Map.of(
            "and", Token.AND, "or", Token.OR, "xor", Token.XOR, "not", Token.NOT,
            "?", Token.ANSWER, ":", Token.COLON);
}
