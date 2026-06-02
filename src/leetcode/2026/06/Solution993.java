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

public class Solution993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        int[] xInfo = findNode(root, x, 0, null);
        int[] yInfo = findNode(root, y, 0, null);

        // Check if x and y are at the same depth and have different parents
        return xInfo[0] == yInfo[0] && xInfo[1] != yInfo[1];
    }

    private int[] findNode(TreeNode node, int val, int depth, TreeNode parent) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return new int[] { depth, parent != null ? parent.val : -1 };
        }
        int[] left = findNode(node.left, val, depth + 1, node);
        if (left != null) {
            return left;
        }
        return findNode(node.right, val, depth + 1, node);
    }

    public static void main(String[] args) {
        Solution993 solution = new Solution993();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        int x1 = 4, y1 = 3;
        System.out.println("Output for test case 1: " + solution.isCousins(root1, x1, y1)); // Output: false

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(5);
        int x2 = 4, y2 = 5;
        System.out.println("Output for test case 2: " + solution.isCousins(root2, x2, y2)); // Output: true

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        int x3 = 4, y3 = 3;
        System.out.println("Output for test case 3: " + solution.isCousins(root3, x3, y3)); // Output: false
    }
}
