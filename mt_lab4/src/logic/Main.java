package logic;

import generator.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/logic/graph.txt";
        String str = "(a and b) -> (c xor a)";
        LogicParser parser = new LogicParser();
        try {
            Tree tree = parser.parse(str);
            tree.treeVisualizer(fileName);
        } catch (ParseException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
