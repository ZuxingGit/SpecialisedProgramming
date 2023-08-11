package classContent.wk3;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
        System.out.println(search(nums3, target3));
    }

    public static int search(int[] nums, int target) {
        int size = nums.length;
        System.out.println(Arrays.toString(nums));
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        if (target < min || target > max) {
            return -1;
        } else {
            int position = -1;
            if (nums[0] == min) {
                for (int i = 0; i < size; i++) {
                    if (nums[i] == target)
                        return i;
                }
            } else {
                if (nums[0] <= target && target <= max) {
                    for (int i = 0; i < size; i++) {
                        if (nums[i] == target)
                            return i;
                    }
                } else {
                    for (int i = size - 1; i > -1; i--) {
                        if (nums[i] == target)
                            return i;
                    }
                }
            }
        }
        return -1;
    }
}
