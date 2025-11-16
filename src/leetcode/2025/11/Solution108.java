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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);
        return node;
    }

    public static void main(String[] args) {
        Solution108 solution = new Solution108();

        // Example 1
        int[] nums1 = { -10, -3, 0, 5, 9 };
        TreeNode bst1 = solution.sortedArrayToBST(nums1);
        // print the resulting BST in-order to verify
        System.out.println(bst1);

        // Example 2
        int[] nums2 = { 1, 3 };
        TreeNode bst2 = solution.sortedArrayToBST(nums2);
        System.out.println(bst2);

    }
}