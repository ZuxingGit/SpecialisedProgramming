public class Solution1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (k % 2 == 1) {
            int minNum = Integer.MAX_VALUE;
            for (int num : nums) {
                minNum = Math.min(minNum, num);
            }
            sum -= 2 * minNum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution1005 solution = new Solution1005();

        int[] nums1 = { 4, 2, 3 };
        int k1 = 1;
        System.out.println(solution.largestSumAfterKNegations(nums1, k1)); // Output: 5

        int[] nums2 = { 3, -1, 0, 2 };
        int k2 = 3;
        System.out.println(solution.largestSumAfterKNegations(nums2, k2)); // Output: 6
    }
}
