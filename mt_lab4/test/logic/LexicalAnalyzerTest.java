package logic;

import generator.ParseException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LexicalAnalyzerTest {

    @Test
    public void aTest() {
        assertEquals(getListLogicToken("a"), List.of(LogicToken.VAR));
    }

    @Test
    public void aOrBTest() {
        assertEquals(getListLogicToken("a -> b"), List.of(LogicToken.VAR, LogicToken.IMPL, LogicToken.VAR));
    }

    @Test
    public void aAndNotBTest() {
        assertEquals(getListLogicToken("a or not b"),
                List.of(LogicToken.VAR, LogicToken.OR, LogicToken.NOT, LogicToken.VAR));
    }

    @Test
    public void aAndNotBWithParensTest() {
        assertEquals(getListLogicToken("a -> (not b)"), List.of(
                LogicToken.VAR, LogicToken.IMPL, LogicToken.LPAREN, LogicToken.NOT, LogicToken.VAR, LogicToken.RPAREN));
    }

    @Test
    public void manyLogicTokenWithWhitespacesTest() {
        assertEquals(getListLogicToken("(  a    ->  b        xor  c )    or   not  c"),
                List.of(LogicToken.LPAREN, LogicToken.VAR, LogicToken.IMPL, LogicToken.VAR,
                        LogicToken.XOR, LogicToken.VAR, LogicToken.RPAREN,
                        LogicToken.OR, LogicToken.NOT, LogicToken.VAR));
    }

    @Test(expected = ParseException.class)
    public void unknownLogicTokenTest() {
        getListLogicToken("a & b");
    }

    private List<LogicToken> getListLogicToken(String str) {
        List<LogicToken> LogicTokens = new ArrayList<>();
        LogicLexicalAnalyzer analyzer = new LogicLexicalAnalyzer(str);

        analyzer.nextToken();

        while (analyzer.getCurToken() != LogicToken.END) {
            LogicTokens.add(analyzer.getCurToken());
            analyzer.nextToken();
        }
        return LogicTokens;
    }
}
