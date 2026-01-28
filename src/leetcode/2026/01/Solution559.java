import java.util.Arrays;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }
        int depth = 0;
        for (Node child : root.children) {
            depth = Math.max(depth, maxDepth(child));
        }
        return depth + 1;
    }

    public static void main(String[] args) {
        Solution559 solution = new Solution559();

        // Example usage:
        Node child1 = new Node(3, Arrays.asList(new Node(5), new Node(6)));
        Node child2 = new Node(2);
        Node child3 = new Node(4);

        Node root = new Node(1, Arrays.asList(child1, child2, child3));

        int depth = solution.maxDepth(root);
        System.out.println(depth); // Output: 3
    }
}
