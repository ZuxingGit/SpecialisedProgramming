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

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new java.util.ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        Solution94 solution = new Solution94();

        // Example 1
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result1 = solution.inorderTraversal(root1);
        System.out.println(result1); // Output: [1, 3, 2]

        // Example 2
        TreeNode root2 = null;
        List<Integer> result2 = solution.inorderTraversal(root2);
        System.out.println(result2); // Output: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        List<Integer> result3 = solution.inorderTraversal(root3);
        System.out.println(result3); // Output: [1]

        // Example 4
        // Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        // Output: [4,2,6,5,7,1,3,9,8]
        TreeNode root4 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7))),
                new TreeNode(3,
                        null,
                        new TreeNode(8,
                                new TreeNode(9),
                                null)));
        List<Integer> result4 = solution.inorderTraversal(root4);
        System.out.println(result4); // Output: [4, 2, 6, 5, 7, 1, 3, 9, 8]
    }
}