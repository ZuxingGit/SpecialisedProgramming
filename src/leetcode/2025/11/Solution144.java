import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new java.util.ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        Solution144 solution = new Solution144();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        List<Integer> result1 = solution.preorderTraversal(root1);
        System.out.println("Example 1: " + result1);
        // Expected: [1, 2, 3]

        // Example 2
        TreeNode root2 = null;
        List<Integer> result2 = solution.preorderTraversal(root2);
        System.out.println("Example 2: " + result2);
        // Expected: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        List<Integer> result3 = solution.preorderTraversal(root3);
        System.out.println("Example 3: " + result3);
        // Expected: [1]

        // Example 4
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.left.right.left = new TreeNode(6);
        root4.left.right.right = new TreeNode(7);
        root4.right = new TreeNode(3);
        root4.right.right = new TreeNode(8);
        root4.right.right.left = new TreeNode(9);
        List<Integer> result4 = solution.preorderTraversal(root4);
        System.out.println("Example 4: " + result4);
        // Expected: [1, 2, 4, 5, 6, 7, 3, 8, 9]
    }
}
