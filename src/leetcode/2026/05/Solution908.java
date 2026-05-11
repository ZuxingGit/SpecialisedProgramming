public class Solution908 {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.max(0, max - min - 2 * k);
    }

    public static void main(String[] args) {
        Solution908 solution = new Solution908();

        int[] nums1 = { 1 };
        int k1 = 0;
        int result1 = solution.smallestRangeI(nums1, k1);
        System.out.println(result1); // Output: 0

        int[] nums2 = { 0, 10 };
        int k2 = 2;
        int result2 = solution.smallestRangeI(nums2, k2);
        System.out.println(result2); // Output: 6

        int[] nums3 = { 1, 3, 6 };
        int k3 = 3;
        int result3 = solution.smallestRangeI(nums3, k3);
        System.out.println(result3); // Output: 0
    }
}
