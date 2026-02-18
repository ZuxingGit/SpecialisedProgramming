public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }
        int duplicate = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        Solution645 solution = new Solution645();

        int[] nums1 = { 1, 2, 2, 4 };
        int[] result1 = solution.findErrorNums(nums1);
        System.out.println("Duplicate: " + result1[0] + ", Missing: " + result1[1]); // Should print Duplicate: 2,
                                                                                     // Missing: 3

        int[] nums2 = { 1, 1 };
        int[] result2 = solution.findErrorNums(nums2);
        System.out.println("Duplicate: " + result2[0] + ", Missing: " + result2[1]); // Should print Duplicate: 1,
                                                                                     // Missing: 2
    }
}
