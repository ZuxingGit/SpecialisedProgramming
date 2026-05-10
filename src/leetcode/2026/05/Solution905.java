public class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution905 solution = new Solution905();

        int[] nums1 = { 3, 1, 2, 4 };
        int[] result1 = solution.sortArrayByParity(nums1);
        printArray(result1); // Output: [2, 4, 3, 1]

        int[] nums2 = { 0 };
        int[] result2 = solution.sortArrayByParity(nums2);
        printArray(result2); // Output: [0]
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
