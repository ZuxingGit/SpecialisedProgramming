package classContent.wk5.sameTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        TreeNode tree3 = new TreeNode();
        TreeNode tree4 = new TreeNode(1, new TreeNode(2,new TreeNode(3,new TreeNode(4),null),null),new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4))));
        System.out.println(isBalanced(tree1));
        System.out.println(isBalanced(tree2));
        System.out.println(isBalanced(tree3));
        System.out.println(isBalanced(tree4));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int depthL = 0, depthR = 0;
        if (root.left == null && root.right == null)
            return true;

        if (root.left != null) {
            depthL = getDepth(root.left) + 1;
        }
        if (root.right != null) {
            depthR = getDepth(root.right) + 1;
        }
        if (Math.abs(depthL - depthR) > 1)
            return false;

        if (root.left != null) {
            if (!isBalanced(root.left))
                return false;
        }
        if (root.right != null) {
            if (!isBalanced(root.right))
                return false;
        }

        return true;
    }

    public static int getDepth(TreeNode node) {
        int dep = 0;
        int depthL = 0, depthR = 0;
        if (node.left == null && node.right == null)
            return 0;

        if (node.left != null) {
            depthL = getDepth(node.left) + 1;
        }
        if (node.right != null) {
            depthR = getDepth(node.right) + 1;
        }
        dep = Math.max(depthL, depthR);
        return dep;
    }
}
