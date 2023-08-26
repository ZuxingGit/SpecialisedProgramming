package classContent.wk5.Tree;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode tree2 = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        TreeNode tree3 = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        tree1.printTree();
        System.out.println(isValidBST(tree1));
        tree2.printTree();
        System.out.println(isValidBST(tree2));
        tree3.printTree();
        System.out.println(isValidBST(tree3));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        int base = root.val;

        if (root.left == null && root.right == null)
            return true;
//----------
        if (root.left != null) {
            if (root.left.val >= root.val)
                return false;
            else if (!isValid(root.left, base, "left"))
                return false;
        }

        if (root.right != null) {
            if (root.right.val <= root.val)
                return false;
            else if (!isValid(root.right, base, "right"))
                return false;
        }

        if (!isValidBST(root.right) || !isValidBST(root.left))
            return false;
//---------------
        return true;
    }

    public static boolean isValid(TreeNode node, int base, String side) {
        if (node == null)
            return true;

        if (node.left == null && node.right == null)
            return true;

        if (side.equals("left")) {
            if (node.left != null && node.left.val >= base)
                return false;
            else if (!isValid(node.left, base, "left"))
                return false;

            if (node.right != null && node.right.val >= base)
                return false;
            else if (!isValid(node.right, base, "left")) {
                return false;
            }
        }
        
        if (side.equals("right")){
            if (node.left != null && node.left.val <= base)
                return false;
            else if (!isValid(node.left, base,"right")) {
                return false;
            }

            if (node.right != null && node.right.val <= base)
                return false;
            else if (!isValid(node.right, base, "right")) {
                return false;
            }
        }
        return true;
    }
}
