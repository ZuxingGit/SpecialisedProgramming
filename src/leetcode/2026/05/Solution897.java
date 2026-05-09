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

public class Solution897 {
    private TreeNode tail;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode dummy = new TreeNode(0);
        tail = dummy;
        inOrder(root);

        return dummy.right;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        tail.right = new TreeNode(node.val);
        tail = tail.right;
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Solution897 solution = new Solution897();

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.right = new TreeNode(8);
        TreeNode result1 = solution.increasingBST(root1);
        printInOrder(result1); // Output: 2 3 4 5 6 8

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        TreeNode result2 = solution.increasingBST(root2);
        printInOrder(result2); // Output: 1 5 7
    }

    private static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}
