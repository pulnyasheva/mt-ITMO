package calculator;

import generator.ParseException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class LexicalAnalyzerTest {

    @Test
    public void intTest() {
        String test = "123";
        assertEquals(getListToken(test), List.of(CalculatorToken.NUMBER));
        assertEquals(getListTokenValue(test), List.of("123"));
    }

    @Test
    public void doubleTest() {
        String test = "123.12";
        assertEquals(getListToken(test), List.of(CalculatorToken.NUMBER));
        assertEquals(getListTokenValue(test), List.of("123.12"));
    }

    @Test
    public void xPlusYTest() {
        String test = "12 + 13";
        assertEquals(getListToken(test),
                List.of(CalculatorToken.NUMBER, CalculatorToken.PLUS, CalculatorToken.NUMBER));
        assertEquals(getListTokenValue(test),
                List.of("12", "+", "13"));
    }

    @Test
    public void xPlusYMulZTest() {
        String test = "12.3 + 13 * 8";
        assertEquals(getListToken(test),
                List.of(CalculatorToken.NUMBER, CalculatorToken.PLUS, CalculatorToken.NUMBER,
                        CalculatorToken.MUL, CalculatorToken.NUMBER));
        assertEquals(getListTokenValue(test),
                List.of("12.3", "+", "13", "*", "8"));
    }

    @Test
    public void parensTest() {
        String test = "12.3 + 13 * 8";
        assertEquals(getListToken("(12)"),
                List.of(CalculatorToken.LPAREN, CalculatorToken.NUMBER, CalculatorToken.RPAREN));
    }

    @Test
    public void manyTokenWithWhitespacesTest() {
        assertEquals(getListToken("(  12    +  56        /  43 )    -     11"),
                List.of(CalculatorToken.LPAREN, CalculatorToken.NUMBER, CalculatorToken.PLUS,
                        CalculatorToken.NUMBER, CalculatorToken.DIV, CalculatorToken.NUMBER, CalculatorToken.RPAREN,
                        CalculatorToken.MINUS, CalculatorToken.NUMBER));
    }

    @Test(expected = ParseException.class)
    public void unknownTokenTest() throws ParseException {
        getListToken("123 & 45");
    }

    private List<CalculatorToken> getListToken(String str) {
        List<CalculatorToken> tokens = new ArrayList<>();
        CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer(str);

        analyzer.nextToken();

        while (analyzer.getCurToken() != CalculatorToken.END) {
            tokens.add(analyzer.getCurToken());
            analyzer.nextToken();
        }
        return tokens;
    }

    private List<String> getListTokenValue(String str) {
        List<String> tokens = new ArrayList<>();
        CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer(str);

        analyzer.nextToken();

        while (analyzer.getCurToken() != CalculatorToken.END) {
            tokens.add(analyzer.getCurValueString());
            analyzer.nextToken();
        }
        return tokens;
    }
}
