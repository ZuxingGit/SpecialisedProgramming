public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution977 solution = new Solution977();

        int[] nums1 = { -4, -1, 0, 3, 10 };
        int[] result1 = solution.sortedSquares(nums1);
        System.out.print("Output for nums1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [0, 1, 9, 16, 100]

        int[] nums2 = { -7, -3, 2, 3, 11 };
        int[] result2 = solution.sortedSquares(nums2);
        System.out.print("Output for nums2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [4, 9, 9, 49, 121]
    }
}
