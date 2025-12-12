public class Solution283 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        Solution283 solution = new Solution283();

        int[] nums1 = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] nums2 = { 0 };
        solution.moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
