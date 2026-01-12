public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Solution485 solution = new Solution485();

        int[] nums1 = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums1));

        int[] nums2 = { 1, 0, 1, 1, 0, 1 };
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums2));
    }
}
