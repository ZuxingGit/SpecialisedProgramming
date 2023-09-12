package classContent.wk8;

import java.util.HashMap;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};
        int[] nums3 = {1, 2};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
        System.out.println(rob(nums3));
    }

    public static int rob(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        return robMax(0, nums, hashMap);
    }

    public static int robMax(int index, int[] nums, HashMap<Integer, Integer> hashMap) {
        int size = nums.length;
        if (size == 1)
            return nums[0];

        if (index == size - 1)
            return nums[size - 1];

        if (index > size - 1)
            return 0;

        if (hashMap.containsKey(index))
            return hashMap.get(index);

        int max = 0;
        for (int i = index; i < size; i++) {
            max = Math.max(nums[i] + robMax(i + 2, nums, hashMap), max);
        }
        hashMap.put(index, max);
        return max;
    }
}
