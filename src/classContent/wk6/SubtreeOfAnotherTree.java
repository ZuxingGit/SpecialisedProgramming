package classContent.wk6;

import classContent.wk5.Tree.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot1 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode root2 = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5));
        TreeNode subRoot2 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode root3 = new TreeNode(1, new TreeNode(1), null);
        TreeNode subRoot3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(3, new TreeNode(4, new TreeNode(1), null), new TreeNode(5, new TreeNode(2), null));
        TreeNode subRoot4 = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        TreeNode root5=new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1))))));
        TreeNode subRoot5=new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1,null,new TreeNode(1)))));
        System.out.println(isSubtree(root1, subRoot1));
        System.out.println(isSubtree(root2, subRoot2));
        System.out.println(isSubtree(root3, subRoot3));
        System.out.println(isSubtree(root4, subRoot4));
        System.out.println(isSubtree(root5, subRoot5));
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return subRoot == null;

        return isSame(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;

        if ((root == null && subRoot != null) || (root != null && subRoot == null))
            return false;

        if (root.val != subRoot.val)
            return false;

        return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
}
