class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }
};

public class Solution671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int min = root.val;
        long secondMin = Long.MAX_VALUE;
        secondMin = dfs(root, min, secondMin);
        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }

    private long dfs(TreeNode node, int min, long secondMin) {
        if (node == null) {
            return secondMin;
        }
        if (node.val > min && node.val < secondMin) {
            secondMin = node.val;
        }
        secondMin = dfs(node.left, min, secondMin);
        secondMin = dfs(node.right, min, secondMin);
        return secondMin;
    }

    public static void main(String[] args) {
        Solution671 solution = new Solution671();

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(7);
        System.out.println(solution.findSecondMinimumValue(root1)); // Should print 5

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        System.out.println(solution.findSecondMinimumValue(root2)); // Should print -1

        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2147483647);
        System.out.println(solution.findSecondMinimumValue(root3)); // Should print 2147483647

        TreeNode root4 = new TreeNode(2);
        System.out.println(solution.findSecondMinimumValue(root4)); // Should print -1
    }
}
