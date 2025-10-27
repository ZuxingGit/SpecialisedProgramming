package leetcode.wk1;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] nums4 = {0, 4, 3, 0};
        int target4 = 0;
        int[] nums5 = {-1, -2, -3, -4, -5};
        int target5 = -8;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
        System.out.println(Arrays.toString(twoSum(nums4, target4)));
        System.out.println(Arrays.toString(twoSum(nums5, target5)));
    }

    /**
     * find 2 numbers that can add up to the target
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target != nums[i] + nums[j]) {
                    continue;
                } else {
                    list.add(i);
                    list.add(j);
                    solution = list.stream().mapToInt(Integer::intValue).toArray();
                    return solution;
                }
            }
        }
        return solution;
    }
}
