// Definition of a binary tree node
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

public class Solution563 {
    private int totalTilt;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        subtreeSum(root);
        return totalTilt;
    }

    private int subtreeSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = subtreeSum(node.left);
        int rightSum = subtreeSum(node.right);
        totalTilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + node.val;
    }

    public static void main(String[] args) {
        Solution563 solution = new Solution563();

        // Example 1
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int output1 = solution.findTilt(root1);
        System.out.println(output1); // Output: 1

        // Example 2
        TreeNode root2 = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7)));
        int output2 = solution.findTilt(root2);
        System.out.println(output2); // Output: 15
    }
}
