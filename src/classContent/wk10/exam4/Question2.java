package classContent.wk10.exam4;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int i = 1;
        int[] nums1 = {1, 2, 3, 4, 5}, queries1 = {3, 8, 9};
        int[] nums2 = {3, 1, 3, 1, 3}, queries2 = {1, 3, 11};
        int[] nums3 = {1, 1, 2, 3, 5, 8, 13}, queries3 = {5, 21, 8};
        int[] nums4 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, queries4 = {10, 20, 30, 40};
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8}, queries5 = {8, 16, 24, 32};
        int[] nums6 = {1, 1, 2, 2, 3, 3}, queries6 = {2, 4, 6};
        int[] nums7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, queries7 = {15, 30, 45, 60, 75};
        int[] nums8 = {1, 3, 5, 7, 9, 11, 13, 15, 17}, queries8 = {17, 34, 51, 68};
        int[] nums9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, queries9 = {12, 24, 36, 48};
        int[] nums10 = {5, 10, 15, 20, 25, 30, 35}, queries10 = {35, 70, 105};
        int[] nums11 = {2, 4, 6, 8, 10, 12, 14, 16}, queries11 = {16, 32, 48};
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums1, queries1)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums2, queries2)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums3, queries3)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums4, queries4)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums5, queries5)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums6, queries6)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums7, queries7)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums8, queries8)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums9, queries9)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums10, queries10)));
        System.out.println("Test case" + i++ + ": " + printBooleanArr(eleganceTest(nums11, queries11)));
    }

    public static boolean[] eleganceTest(int[] nums, int[] queries) {
        if (nums.length == 0 || queries.length == 0)
            return null;

        int length = queries.length;
        boolean[] res = new boolean[length];
        Arrays.sort(nums);
        ArrayList<Integer> DPlist = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            res[i] = isElegant(nums, queries[i], DPlist);
        }
        return res;
    }

    public static boolean isElegant(int[] nums, int target, ArrayList<Integer> list) {
        if (list.contains(Integer.valueOf(target)))
            return true;

        int sum = Arrays.stream(nums).sum();
        int length = nums.length;
        list.add(sum);

        if (nums.length == 1) {
            if (nums[0] != target)
                return false;
            else
                return true;
        } else {
            if (sum == target) {
                return true;
            } else if (sum < target) {
                return false;
            } else {
                int mid = (nums[0] + nums[nums.length - 1]) / 2;
                if (mid == nums[length - 1] || mid == 0) {
                    return false;
                }
                int index = 0;
                for (int i = 0; i < length; i++) {
                    if (nums[i] <= mid) {
                        index++;
                    } else {
                        break;
                    }
                }

                int[] left = Arrays.copyOfRange(nums, 0, index);
                int[] right = Arrays.copyOfRange(nums, index, length);
                if (right.length > 0 && right[0] > target) {
                    return isElegant(left, target, list);
                }
                return isElegant(left, target, list) || isElegant(right, target, list);
            }

        }
    }

    public static String printBooleanArr(boolean[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Boolean b :
                bArr) {
            stringBuilder.append(b + ",");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
