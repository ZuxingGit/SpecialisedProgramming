package classContent.wk5.sameTree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode tree2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode tree3 = new TreeNode();
        tree1.printTree();
        invertTree(tree1);
        tree1.printTree();
        
        tree2.printTree();
        invertTree(tree2);
        tree2.printTree();
        
        tree3.printTree();
        invertTree(tree3);
        tree3.printTree();
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return root;
        else {
            TreeNode nodeTmp = new TreeNode();
            if (root.left != null) {
                nodeTmp = invertTree(root.left);
            } else {
                nodeTmp = null;
            }
            if (root.right != null) {
                root.left = invertTree(root.right);
            } else {
                root.left = null;
            }
            root.right = nodeTmp;
        }
        
        return root;
    }
}
