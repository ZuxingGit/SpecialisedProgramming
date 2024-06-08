package classContent.wk9;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] nums1 = {5, 2, 3, 1};
        int[] nums2 = {5, 1, 1, 2, 0, 0};
        System.out.println(Arrays.toString(sortArray(nums1)));
        System.out.println(Arrays.toString(sortArray(nums2)));
    }

    public static int[] sortArray(int[] nums) {
        int length = nums.length;
        mergeSort(nums, 0, length - 1);
        return nums;
    }

    public static void merge(int[] nums, int l, int m, int r) {
        int size1 = m - l + 1;
        int size2 = r - m;
        int[] leftPart = new int[size1];
        int[] rightPart = new int[size2];
        for (int i = 0; i < size1; i++) {
            leftPart[i] = nums[l + i];
        }
        for (int i = 0; i < size2; i++) {
            rightPart[i] = nums[m + i + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < size1 || j < size2) {
            if (j == size2 || i < size1 && leftPart[i] < rightPart[j])
                nums[k++] = leftPart[i++];
            else
                nums[k++] = rightPart[j++];
        }
    }

    public static void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int m = (r - l) / 2 + l;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);
            merge(nums, l, m, r);
        }
    }
}
