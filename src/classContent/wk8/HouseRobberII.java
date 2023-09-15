package classContent.wk8;

import java.util.HashMap;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 3};
        int[] nums4 = {2, 1, 1, 2};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
        System.out.println(rob(nums3));
        System.out.println(rob(nums4));
    }

    public static int rob(int[] nums) {
        int size = nums.length;
        
        return Math.max(robAdvance(nums, true, size, 0, new HashMap<>()),
                robAdvance(nums, false, size, 1, new HashMap<>()));
    }

    public static int robAdvance(int[] nums, boolean stoleFirst, int size, int index, HashMap<Integer, Integer> hashMap) {
        if (size == 1) {
            return nums[0];
        }

        if (index == size - 1) {
            if (stoleFirst)
                return 0;
            else
                return nums[index];
        }

        if (index > size - 1)
            return 0;

        if (hashMap.containsKey(index))
            return hashMap.get(index);

        int max = 0;
        for (int i = index; i < size; i++) {
            if (stoleFirst && i == size - 1) {
                break;
            }
            max = Math.max(max, nums[i] + robAdvance(nums, stoleFirst, size, i + 2, hashMap));
        }

        hashMap.put(index, max);
        return max;
    }
}
