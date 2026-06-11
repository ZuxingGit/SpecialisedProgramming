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

public class Solution1022 {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }
        currentSum = (currentSum << 1) | node.val;
        if (node.left == null && node.right == null) {
            return currentSum;
        }
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }

    public static void main(String[] args) {
        Solution1022 solution = new Solution1022();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(0);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(1);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(1);
        System.out.println(solution.sumRootToLeaf(root1)); // Output: 22

        TreeNode root2 = new TreeNode(0);
        System.out.println(solution.sumRootToLeaf(root2)); // Output: 0
    }
}
