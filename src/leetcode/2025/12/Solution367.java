public class Solution367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long squared = mid * mid;

            if (squared == num) {
                return true;
            } else if (squared < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution367 solution = new Solution367();

        int num0 = 9;
        System.out.println(solution.isPerfectSquare(num0)); // Output: true

        int num1 = 16;
        System.out.println(solution.isPerfectSquare(num1)); // Output: true

        int num2 = 14;
        System.out.println(solution.isPerfectSquare(num2)); // Output: false
    }
}
