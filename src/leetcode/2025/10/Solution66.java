public class Solution66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        Solution66 solution = new Solution66();

        int[] digits1 = { 1, 2, 3 };
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [1, 2, 4]

        int[] digits2 = { 4, 3, 2, 1 };
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [4, 3, 2, 2]

        int[] digits3 = { 9 };
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [1, 0]
    }
}
