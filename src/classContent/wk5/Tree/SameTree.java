package classContent.wk5.Tree;

public class SameTree {
    public static void main(String[] args) {
        TreeNode tnLeft1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tnRight1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tnLeft2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tnRight2 = new TreeNode(1, null, new TreeNode(2));
        TreeNode tnLeft3 = new TreeNode();
        TreeNode tnRight3 = new TreeNode();
        TreeNode tnLeft4 = new TreeNode(0, new TreeNode(-5), null);
        TreeNode tnRight4 = new TreeNode(0, new TreeNode(-8), null);

        System.out.println(isSameTree(tnLeft1, tnRight1));
        System.out.println(isSameTree(tnLeft2, tnRight2));
        System.out.println(isSameTree(tnLeft3, tnRight3));
        System.out.println(isSameTree(tnLeft4, tnRight4));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null))
            return false;

        if (p == null && q == null)
            return true;

        if (p.val != q.val)
            return false;

        if (p.val == q.val) {
            if ((p.left != null && q.left == null) || (p.left == null && q.left != null))
                return false;

            if ((p.right != null && q.right == null) || (p.right == null && q.right != null))
                return false;

            if (p.left != null && q.left != null) {
                TreeNode pLeft = p.left;
                TreeNode qLeft = q.left;
                if (!isSameTree(pLeft, qLeft))
                    return false;
            }

            if (p.right != null && q.right != null) {
                TreeNode pRight = p.right;
                TreeNode qRight = q.right;
                if (!isSameTree(pRight, qRight))
                    return false;
            }
        }

        return true;
    }
}
