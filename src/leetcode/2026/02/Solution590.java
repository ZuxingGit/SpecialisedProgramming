import java.util.ArrayList;
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
}

public class Solution590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(Node node, List<Integer> result) {
        if (node.children != null) {
            for (Node child : node.children) {
                postorderHelper(child, result);
            }
        }
        result.add(node.val);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);
        root.children = new ArrayList<>();
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        Node grandchild1 = new Node(5);
        Node grandchild2 = new Node(6);
        child1.children = new ArrayList<>();
        child1.children.add(grandchild1);
        child1.children.add(grandchild2);

        Solution590 solution = new Solution590();
        List<Integer> postorderResult = solution.postorder(root);
        System.out.println(postorderResult); // Should print [5, 6, 3, 2, 4, 1]
    }
}
