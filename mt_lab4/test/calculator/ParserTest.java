package calculator;

import generator.ParseException;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class ParserTest {
    private static final CalculatorParser parser = new CalculatorParser();

    @Test
    public void addTest() {
        assertEquals(parser.parse("12 + 3"), (double) 15);
    }

    @Test
    public void subTest() {
        assertEquals(parser.parse("12 - 3"), (double) 9);
    }

    @Test
    public void mulTest() {
        assertEquals(parser.parse("5 * 2"), (double) 10);
    }

    @Test
    public void divTest() {
        assertEquals(parser.parse("6 / 2"), (double) 3);
    }

    @Test
    public void manyOperatorsTest() {
        assertEquals(parser.parse("6 + 2 * 2 - 7"), (double) 3);
    }

    @Test
    public void manyOperatorsWithParentsTest() {
        assertEquals(parser.parse("(6 + 2) * 2 - 7"), (double) 9);
    }

    @Test(expected = ParseException.class)
    public void uncorrectedParensTest() {
        parser.parse("( 12 + 3");
    }

    @Test(expected = ParseException.class)
    public void uncorrectedAddTest() {
        parser.parse(" 12 + ");
    }

    @Test(expected = ParseException.class)
    public void emptyParensTest() {
        parser.parse("( )");
    }
}
