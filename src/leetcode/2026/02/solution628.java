import java.util.Arrays;

public class solution628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }

    public static void main(String[] args) {
        solution628 solution = new solution628();

        int[] nums1 = { 1, 2, 3 };
        System.out.println(solution.maximumProduct(nums1)); // Should print 6

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(solution.maximumProduct(nums2)); // Should print 24

        int[] nums3 = { -1, -2, -3 };
        System.out.println(solution.maximumProduct(nums3)); // Should print -6
    }
}
