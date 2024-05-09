import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LexicalAnalyzerTest {

    @Test
    public void aTest() throws ParseException {
        assertEquals(getListToken("a"), List.of(Token.VAR));
    }

    @Test
    public void aOrBTest() throws ParseException {
        assertEquals(getListToken("a or b ? a : b"),
                List.of(Token.VAR, Token.OR, Token.VAR, Token.ANSWER, Token.VAR, Token.COLON, Token.VAR));
    }

    @Test
    public void aAndNotBTest() throws ParseException {
        assertEquals(getListToken("a or not b"), List.of(Token.VAR, Token.OR, Token.NOT, Token.VAR));
    }

    @Test
    public void aAndNotBWithParensTest() throws ParseException {
        assertEquals(getListToken("a or (not b)"), List.of(
                Token.VAR, Token.OR, Token.LPAREN, Token.NOT, Token.VAR, Token.RPAREN));
    }

    @Test
    public void manyTokenWithWhitespacesTest() throws ParseException {
        assertEquals(getListToken("(  a    and  b        xor  c )    or   not  c"),
                List.of(Token.LPAREN, Token.VAR, Token.AND, Token.VAR, Token.XOR, Token.VAR, Token.RPAREN,
                        Token.OR, Token.NOT, Token.VAR));
    }

    @Test(expected = ParseException.class)
    public void unknownTokenTest() throws ParseException {
        getListToken("a & b");
    }

    private List<Token> getListToken(String str) throws ParseException {
        List<Token> tokens = new ArrayList<>();
        LexicalAnalyzer analyzer = new LexicalAnalyzer(str);

        analyzer.nextToken();

        while (analyzer.getCurToken() != Token.END) {
            tokens.add(analyzer.getCurToken());
            analyzer.nextToken();
        }
        return tokens;
    }
}
