public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAverage = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                maxAverage = Math.max(maxAverage, sum / k);
                sum -= nums[i - k + 1];
            }
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        Solution643 solution = new Solution643();

        int[] nums1 = { 1, 12, -5, -6, 50, 3 };
        int k1 = 4;
        System.out.println(solution.findMaxAverage(nums1, k1)); // Should print 12.75

        int[] nums2 = { 5 };
        int k2 = 1;
        System.out.println(solution.findMaxAverage(nums2, k2)); // Should print 5.0
    }
}
