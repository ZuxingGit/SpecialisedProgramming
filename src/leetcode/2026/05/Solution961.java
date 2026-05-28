public class Solution961 {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1; // This line should never be reached since the problem guarantees a solution.
    }

    public static void main(String[] args) {
        Solution961 solution = new Solution961();

        int[] nums1 = { 1, 2, 3, 3 };
        int result1 = solution.repeatedNTimes(nums1);
        System.out.println("Output for nums1: " + result1); // Output: 3

        int[] nums2 = { 2, 1, 2, 5, 3, 2 };
        int result2 = solution.repeatedNTimes(nums2);
        System.out.println("Output for nums2: " + result2); // Output: 2

        int[] nums3 = { 5, 1, 5, 2, 5, 3, 5, 4 };
        int result3 = solution.repeatedNTimes(nums3);
        System.out.println("Output for nums3: " + result3); // Output: 5
    }
}
