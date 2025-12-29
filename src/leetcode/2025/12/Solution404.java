class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        Solution404 solution = new Solution404();

        // Example 1
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int result1 = solution.sumOfLeftLeaves(root1);
        System.out.println("Sum of left leaves (Example 1): " + result1); // Expected output: 24

        // Example 2
        TreeNode root2 = new TreeNode(1);
        int result2 = solution.sumOfLeftLeaves(root2);
        System.out.println("Sum of left leaves (Example 2): " + result2); // Expected output: 0
    }
}
