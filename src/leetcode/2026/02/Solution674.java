public class Solution674 {
    // Longest Continuous Increasing Subsequence
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Check at the end of the loop in case the longest sequence ends at the last
        // element
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }

    public static void main(String[] args) {
        Solution674 solution = new Solution674();

        int[] nums1 = { 1, 3, 5, 4, 7 };
        System.out.println(solution.findLengthOfLCIS(nums1)); // Should print 3

        int[] nums2 = { 2, 2, 2, 2, 2 };
        System.out.println(solution.findLengthOfLCIS(nums2)); // Should print 1
    }
}
