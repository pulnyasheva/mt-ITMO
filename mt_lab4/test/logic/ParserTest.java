package logic;

import generator.ParseException;
import org.junit.Test;


public class ParserTest {

    private static final LogicParser parser = new LogicParser();

    @Test
    public void allOperationsTest() {
        parser.parse("a or b -> not c xor d");
    }

    @Test
    public void allOperationsWithParensTest() {
        parser.parse("(a or b) and not c -> d");
    }

    @Test
    public void doubleNotTest() {
        parser.parse("not not a");
    }

    @Test(expected = ParseException.class)
    public void uncorrectedParensTest() {
        parser.parse("( not a");
    }

    @Test(expected = ParseException.class)
    public void emptyParensTest() {
        parser.parse("( )");
    }
}
