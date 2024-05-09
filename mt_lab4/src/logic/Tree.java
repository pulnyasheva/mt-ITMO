package logic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class Tree {
    private String node;
    private List<Tree> children;
    private int index;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
    }

    public String getNode() {
        return node;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void treeVisualizer(String fileName) throws IOException {
        index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("digraph {\n");

        descent(node, children, sb, true, index);

        sb.append("}");

        try (final Writer writer = new FileWriter(fileName)) {
            writer.write(sb.toString());
        }
    }

    private void descent(String node, List<Tree> children, StringBuilder sb, boolean isTop, int number) {
        int curNumber = index++;
        sb.append("\t").append(curNumber).append(" [label = \"").append(node).append("\"]\n");
        if (!isTop) sb.append("\t").append(number).append(" -> ").append(curNumber).append("\n");
        if (children == null) return;
        for (Tree child : children) {
            descent(child.getNode(), child.getChildren(), sb, false, curNumber);
        }
    }
}