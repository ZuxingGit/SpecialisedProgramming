package classContent.wk7;

import java.util.HashMap;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        int[] nums3 = {0, 2};
        int[] nums4 = {2, 0};
        int[] nums5 = {2, 0, 0};
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));
        System.out.println(canJump(nums3));
        System.out.println(canJump(nums4));
        System.out.println(canJump(nums5));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        else if (nums.length > 1 && nums[0] == 0) {
            return false;
        }
        HashMap<Integer, Boolean> dpMap = new HashMap<>();
        return canJump2(0, nums, dpMap);
    }

    public static boolean canJump2(int index, int[] nums, HashMap<Integer, Boolean> dpMap) {
        if (dpMap.containsKey(index))
            return dpMap.get(index);

        boolean res = false;

        int maxSteps = 0;
        if (index < nums.length - 1)
            maxSteps = nums[index];

        if (maxSteps == 0) {
            dpMap.put(index, false);
            return false;
        }

        for (int i = maxSteps; i >= 1; i--) {
            if (index + i >= nums.length - 1) {
                dpMap.put(index, true);
                return true;
            }
            res = res || canJump2(index + i, nums, dpMap);
        }

        dpMap.put(index, res);
        return res;
    }
}
