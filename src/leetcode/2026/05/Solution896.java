public class Solution896 {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        Solution896 solution = new Solution896();

        int[] nums1 = { 1, 2, 3, 4 };
        System.out.println(solution.isMonotonic(nums1)); // Output: true

        int[] nums2 = { 4, 3, 2, 1 };
        System.out.println(solution.isMonotonic(nums2)); // Output: true

        int[] nums3 = { 1, 3, 2 };
        System.out.println(solution.isMonotonic(nums3)); // Output: false

        int[] nums4 = { 1, 1, 1 };
        System.out.println(solution.isMonotonic(nums4)); // Output: true
    }
}