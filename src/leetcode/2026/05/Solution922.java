public class Solution922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution922 solution = new Solution922();

        int[] nums1 = { 4, 2, 5, 7 };
        int[] result1 = solution.sortArrayByParityII(nums1);
        System.out.print("Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [4, 5, 2, 7]

        int[] nums2 = { 2, 3 };
        int[] result2 = solution.sortArrayByParityII(nums2);
        System.out.print("Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Output: [2, 3]
    }
}
