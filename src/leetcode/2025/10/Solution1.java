import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        Solution1 solution1 = new Solution1();
        int[] result = solution1.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution1.twoSum(nums2, target2);
        System.out.println(result2[0] + ", " + result2[1]);

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution1.twoSum(nums3, target3);
        System.out.println(result3[0] + ", " + result3[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target != nums[i] + nums[j]) {
                    continue;
                } else {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }
}
