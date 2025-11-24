public class Solution169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Solution169 solution = new Solution169();

        // Example 1
        int[] nums1 = { 3, 2, 3 };
        int result1 = solution.majorityElement(nums1);
        System.out.println("Example 1: " + result1);
        // Expected: 3

        // Example 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        int result2 = solution.majorityElement(nums2);
        System.out.println("Example 2: " + result2);
        // Expected: 2
    }
}
