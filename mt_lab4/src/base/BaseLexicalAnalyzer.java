package base;

import generator.ParseException;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseLexicalAnalyzer<T extends Enum<T>> {
    private final Map<T, Pattern> tokens;
    private final List<Pattern> skip;
    private final String curString;

    private String curValueString;
    private int curPos;
    private T curToken;
    private final T endToken;

    public BaseLexicalAnalyzer(Map<T, Pattern> tokens, List<Pattern> skip,
                               String curString, T endToken) {
        this.tokens = tokens;
        this.skip = skip;
        this.curString = curString;
        this.endToken = endToken;
        curPos = 0;
    }

    private void skip() {
        if (curPos >= curString.length()) return;
        while (true) {
            int pos = curPos;
            for (Pattern skipToken : skip) {
                Matcher matcher = skipToken.matcher(curString);
                if (matcher.find(curPos) && matcher.start() == curPos) {
                    curPos = matcher.toMatchResult().end();
                }
            }
            if (pos == curPos) break;
        }
    }

    public void nextToken() {
        skip();
        if (curPos >= curString.length()) {
            curToken = endToken;
            return;
        }
        T token = null;
        int pos = curPos;
        int endPos = curPos;
        String value = "";
        for (Map.Entry<T, Pattern> entry : tokens.entrySet()) {
            Matcher matcher = entry.getValue().matcher(curString);
            if (matcher.find(pos) && matcher.start() == pos) {
                if (token != null && matcher.group().length() > value.length()) {
                    endPos = matcher.toMatchResult().end();
                    value = matcher.group();
                    token = entry.getKey();
                }
                if (token == null) {
                    endPos = matcher.toMatchResult().end();
                    value = matcher.group();
                    token = entry.getKey();
                }
            }
        }
        if (token == null) {
            throw new ParseException("Unknown token", pos);
        }
        curPos = endPos;
        curValueString = value;
        curToken = token;
    }

    public T getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

    public String getCurValueString() {
        return curValueString;
    }
}
