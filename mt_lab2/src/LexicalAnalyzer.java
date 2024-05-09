import java.text.ParseException;

public class LexicalAnalyzer {
    private String curString;
    private int curPos;
    private Token curToken;

    public LexicalAnalyzer(String string) {
        this.curString = string;
        curPos = 0;
    }

    private boolean isBlank(char c) {
        return Character.isWhitespace(c);
    }

    private void skipWhitespaces() {
        if (curPos >= curString.length()) return;
        while (isBlank(curString.charAt(curPos))) {
            curPos++;
        }
    }


    public void nextToken() throws ParseException {
        skipWhitespaces();
        if (curPos >= curString.length()) {
            curToken = Token.END;
            return;
        }
        char curChar = curString.charAt(curPos);
        switch (curChar) {
            case '(' -> {
                curPos++;
                curToken = Token.LPAREN;
            }
            case ')' -> {
                curPos++;
                curToken = Token.RPAREN;
            }
            default -> parseToken();
        }
    }

    public void parseToken() throws ParseException {
        int startPos = curPos;
        while (curPos < curString.length()) {
            char curChar = curString.charAt(curPos);
            if (isBlank(curChar)) break;
            if (curChar == '(' || curChar == ')') break;
            curPos++;
        }
        String str = curString.substring(startPos, curPos);
        if (Token.tokenMap.containsKey(str)) {
            curToken = Token.tokenMap.get(str);
        } else if (str.matches("[a-z]")) {
            curToken = Token.VAR;
        } else {
            throw new ParseException("Illegal token " + str, startPos);
        }
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }
}
