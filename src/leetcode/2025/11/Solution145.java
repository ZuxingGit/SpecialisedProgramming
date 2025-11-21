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

public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new java.util.ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }

    public static void main(String[] args) {
        Solution145 solution = new Solution145();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        List<Integer> result1 = solution.postorderTraversal(root1);
        System.out.println("Example 1: " + result1);
        // Expected: [3, 2, 1]

        // Example 2
        TreeNode root2 = null;
        List<Integer> result2 = solution.postorderTraversal(root2);
        System.out.println("Example 2: " + result2);
        // Expected: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        List<Integer> result3 = solution.postorderTraversal(root3);
        System.out.println("Example 3: " + result3);
        // Expected: [1]

        // Example 4: [1,2,3,4,5,null,8,null,null,6,7,9]
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.left.right.left = new TreeNode(6);
        root4.left.right.right = new TreeNode(7);
        root4.right = new TreeNode(3);
        root4.right.right = new TreeNode(8);
        root4.right.right.left = new TreeNode(9);
        List<Integer> result4 = solution.postorderTraversal(root4);
        System.out.println("Example 4: " + result4);
        // Expected: [4, 6, 7, 5, 2, 9, 8, 3, 1]
    }
}