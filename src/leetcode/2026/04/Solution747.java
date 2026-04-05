public class Solution747 {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > nums[maxIndex]) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Solution747 solution = new Solution747();

        int[] nums = { 3, 6, 1, 0 };
        int output = solution.dominantIndex(nums);
        System.out.println("Output: " + output);

        nums = new int[] { 1, 2, 3, 4 };
        output = solution.dominantIndex(nums);
        System.out.println("Output: " + output);

        nums = new int[] { 1 };
        output = solution.dominantIndex(nums);
        System.out.println("Output: " + output);
    }
}
