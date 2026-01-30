import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution561 solution = new Solution561();

        int[] input1 = { 1, 4, 3, 2 };
        int output1 = solution.arrayPairSum(input1);
        System.out.println(output1); // Output: 4

        int[] input2 = { 6, 2, 6, 5, 1, 2 };
        int output2 = solution.arrayPairSum(input2);
        System.out.println(output2); // Output: 9
    }
}
