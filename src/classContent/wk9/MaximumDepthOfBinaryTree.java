package classContent.wk9;

import classContent.wk5.Tree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode t2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(maxDepth(t1));
        System.out.println(maxDepth(t2));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
