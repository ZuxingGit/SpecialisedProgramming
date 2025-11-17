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

public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int newTarget = targetSum - root.val;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }

    public static void main(String[] args) {
        Solution112 solution = new Solution112();

        // Example 1
        TreeNode root1 = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1))));
        int targetSum1 = 22;
        boolean result1 = solution.hasPathSum(root1, targetSum1);
        System.out.println("Example 1: " + result1); // Expected: true

        // Example 2
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        int targetSum2 = 5;
        boolean result2 = solution.hasPathSum(root2, targetSum2);
        System.out.println("Example 2: " + result2); // Expected: false

        // Example 3
        TreeNode root3 = null;
        int targetSum3 = 0;
        boolean result3 = solution.hasPathSum(root3, targetSum3);
        System.out.println("Example 3: " + result3); // Expected: false
    }
}
