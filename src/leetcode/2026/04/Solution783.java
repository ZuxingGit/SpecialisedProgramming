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

public class Solution783 {
    public int minDiffInBST(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        TreeNode prev = null;

        while (root != null) {
            if (root.left == null) {
                if (prev != null) {
                    minDiff = Math.min(minDiff, root.val - prev.val);
                }
                prev = root;
                root = root.right;
            } else {
                TreeNode predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    predecessor.right = null;
                    if (prev != null) {
                        minDiff = Math.min(minDiff, root.val - prev.val);
                    }
                    prev = root;
                    root = root.right;
                }
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Solution783 solution = new Solution783();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int output = solution.minDiffInBST(root);
        System.out.println("Output: " + output);

        root = new TreeNode(1);
        root.right = new TreeNode(3);

        output = solution.minDiffInBST(root);
        System.out.println("Output: " + output);
    }
}
