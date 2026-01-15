public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    indexInNums2 = j;
                    break;
                }
            }
            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution496 solution = new Solution496();

        int[] nums1_1 = { 4, 1, 2 };
        int[] nums2_1 = { 1, 3, 4, 2 };
        int[] result1 = solution.nextGreaterElement(nums1_1, nums2_1);
        System.out.print("Next Greater Elements: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums1_2 = { 2, 4 };
        int[] nums2_2 = { 1, 2, 3, 4 };
        int[] result2 = solution.nextGreaterElement(nums1_2, nums2_2);
        System.out.print("Next Greater Elements: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
