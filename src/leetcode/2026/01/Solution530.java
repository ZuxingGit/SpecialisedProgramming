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

public class Solution530 {
    public int getMinimumDifference(TreeNode root) {
        int[] prev = { -1 };
        int[] minDiff = { Integer.MAX_VALUE };
        inorderTraversal(root, prev, minDiff);
        return minDiff[0];
    }

    private void inorderTraversal(TreeNode node, int[] prev, int[] minDiff) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, prev, minDiff);

        if (prev[0] != -1) {
            minDiff[0] = Math.min(minDiff[0], node.val - prev[0]);
        }
        prev[0] = node.val;

        inorderTraversal(node.right, prev, minDiff);
    }

    public static void main(String[] args) {
        Solution530 solution = new Solution530();

        TreeNode root1 = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));
        System.out.println("The minimum absolute difference in the BST is: " +
                solution.getMinimumDifference(root1));

        TreeNode root2 = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                        new TreeNode(12),
                        new TreeNode(49)));
        System.out.println("The minimum absolute difference in the BST is: " +
                solution.getMinimumDifference(root2));
    }
}
