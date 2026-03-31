
public class Solution724 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the pivot index
            }
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        Solution724 solution = new Solution724();

        int[] input = { 1, 7, 3, 6, 5, 6 };
        int output = solution.pivotIndex(input);
        System.out.println("Output: " + output);

        input = new int[] { 1, 2, 3 };
        output = solution.pivotIndex(input);
        System.out.println("Output: " + output);

        input = new int[] { 2, 1, -1 };
        output = solution.pivotIndex(input);
        System.out.println("Output: " + output);
    }
}
