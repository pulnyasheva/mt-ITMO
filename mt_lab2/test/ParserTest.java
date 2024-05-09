import org.junit.Test;

import java.text.ParseException;

public class ParserTest {

    private static final Parser parser = new Parser();

    @Test
    public void allOperationsTest() throws ParseException {
        parser.parse("a or b and not c xor d");
    }

    @Test
    public void allOperationsWithParensTest() throws ParseException {
        parser.parse("(a or b) ? not c xor d : p");
    }

    @Test
    public void doubleNotTest() throws ParseException {
        parser.parse("not not a");
    }

    @Test(expected = ParseException.class)
    public void uncorrectedParensTest() throws ParseException {
        parser.parse("( not a");
    }

    @Test(expected = ParseException.class)
    public void emptyParensTest() throws ParseException {
        parser.parse("( )");
    }
}
