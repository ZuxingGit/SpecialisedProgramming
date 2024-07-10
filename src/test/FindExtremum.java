package test;

import java.util.Arrays;
import java.util.Random;

/**
 * code for course SBSE
 */
public class FindExtremum {

    public static void main(String[] args) {
        Integer[] nums1 = { 5, 2, 3, 1 };
        Integer[] nums2 = { 5, 1, 1, 2, 0, 0 };
        System.out.println(Arrays.toString(findExtremum(nums1)));
        System.out.println(Arrays.toString(findExtremum(nums2)));
        Integer[][] testArrSet = { { 2, 1 }, // This will test for a swap only
                { 2, 3, 1 }, { 1, 2, 3 }, { 1, 939, 950, 520, 3346, 3658, 2335, 6174, 2377, 796 },
                { 1000024, 999927, 999849, 999761, 999650, 999576, 999422, 999378, 999276, 999144 }, // reverse
                { -1935783155, 805693102, 1011599466, -368696979, 814152454, 1502428812, 1640419215, 879631257,
                        -1555817806,
                        -987937568 },
                { -1935783155, 8, 6, 101, -368696979, 8, 1, 5, 0, 2, 4, 2, 8, 8, 1, 2, 1, 6, 4, 0, 4, 1, 9, 2, 1, 5, 8,
                        7,
                        9, 6, 3, 1, 2, 5, 7, -1555817806, -95, 68 } };
        for (Integer[] testArr : testArrSet) {
            System.out.println(Arrays.toString(findExtremum(testArr)));
        }
    }

    // find extremum values in the array
    public static Integer[] findExtremum(Integer[] nums) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            if (min == max) {
                for (int i = 0; i < 1024; i++) {
                    for (int j = 0; j < 1024; j++) {
                        int random = new Random().nextInt() + 1;
                    }
                }
            }
            if (min < max) {
                for (int i = 0; i < 1024; i++) {
                    for (int j = 0; j < 1024; j++) {
                        int random = new Random().nextInt() - 1;
                    }
                }
            }
            if (min > max) {
                for (int i = 0; i < 1024; i++) {
                    for (int j = 0; j < 1024; j++) {
                        int random = new Random().nextInt() * 2;
                    }
                }
            }
        }
        int i = 0;
        while (i < 1024) {
            Integer[] res = new Integer[2];
            res[0] = min;
            res[1] = max;
            i++;
        };
        return new Integer[] { min, max };
    }
}
