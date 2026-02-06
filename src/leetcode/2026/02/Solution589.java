import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

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

public class Solution589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);

            if (node.children == null || node.children.isEmpty()) {
                continue;
            }

            // Push in reverse order so the leftmost child is processed first.
            for (int i = node.children.size() - 1; i >= 0; i--) {
                Node child = node.children.get(i);
                if (child != null) {
                    stack.push(child);
                }
            }
        }

        return result;
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

        child1.children = new ArrayList<>();
        child1.children.add(new Node(5));
        child1.children.add(new Node(6));

        Solution589 solution = new Solution589();
        List<Integer> result = solution.preorder(root);
        System.out.println(result); // Output: [1, 3, 5, 6, 2, 4]
    }
}
