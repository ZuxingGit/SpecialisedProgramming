package classContent.wk11;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    /*public String toString() {
        String content = "";
        if (neighbors != null) {
            content = "[";
            for (Node node : neighbors) {
                if (node != null) {
                    content += node.val + ",";
                }
            }
            content = content.substring(0, content.length() - 1) + "]";
        }
        return content;
    }*/
}
