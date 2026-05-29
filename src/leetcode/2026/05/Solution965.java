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

public class Solution965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        int value = root.val;
        return isUnivalTreeHelper(root, value);
    }

    private boolean isUnivalTreeHelper(TreeNode node, int value) {
        if (node == null) {
            return true;
        }
        if (node.val != value) {
            return false;
        }
        return isUnivalTreeHelper(node.left, value) && isUnivalTreeHelper(node.right, value);
    }

    public static void main(String[] args) {
        Solution965 solution = new Solution965();

        TreeNode root1 = new TreeNode(1, new TreeNode(1), new TreeNode(1));
        boolean result1 = solution.isUnivalTree(root1);
        System.out.println("Output for root1: " + result1); // Output: true

        TreeNode root2 = new TreeNode(2, new TreeNode(2), new TreeNode(5));
        boolean result2 = solution.isUnivalTree(root2);
        System.out.println("Output for root2: " + result2); // Output: false

        TreeNode root3 = new TreeNode(3, new TreeNode(3), new TreeNode(3));
        boolean result3 = solution.isUnivalTree(root3);
        System.out.println("Output for root3: " + result3); // Output: true
    }
}
