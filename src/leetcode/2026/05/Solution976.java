import java.util.Arrays;

public class Solution976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution976 solution = new Solution976();

        int[] nums1 = { 2, 1, 2 };
        int result1 = solution.largestPerimeter(nums1);
        System.out.println("Output for nums1: " + result1); // Output: 5

        int[] nums2 = { 1, 2, 1 };
        int result2 = solution.largestPerimeter(nums2);
        System.out.println("Output for nums2: " + result2); // Output: 0

        int[] nums3 = { 3, 2, 3, 4 };
        int result3 = solution.largestPerimeter(nums3);
        System.out.println("Output for nums3: " + result3); // Output: 10
    }
}
