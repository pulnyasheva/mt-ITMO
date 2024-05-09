import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        String fileName = "graph.txt";
        String str = "a ? b : d";
        Parser parser = new Parser();
        try {
            Tree tree = parser.parse(str);
            tree.treeVisualizer(fileName);
        } catch (ParseException e) {
            System.out.println(e.getMessage() + " at index " + e.getErrorOffset());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}