package classContent.wk9;

import classContent.wk5.Tree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode t2 = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
        System.out.println(minDepth(t1));
        System.out.println(minDepth(t2));
    }

    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        } else if (root.left != null && root.right == null) {
            return 1 + minDepth((root.left));
        } else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
