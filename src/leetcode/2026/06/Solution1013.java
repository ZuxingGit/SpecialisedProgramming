public class Solution1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int currentSum = 0;
        int count = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum == target) {
                count++;
                currentSum = 0;
            }
        }

        return count >= 3;
    }

    public static void main(String[] args) {
        Solution1013 solution = new Solution1013();

        int[] arr1 = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };
        System.out.println(solution.canThreePartsEqualSum(arr1)); // Output: true

        int[] arr2 = { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 };
        System.out.println(solution.canThreePartsEqualSum(arr2)); // Output: false

        int[] arr3 = { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 };
        System.out.println(solution.canThreePartsEqualSum(arr3)); // Output: true
    }
}
