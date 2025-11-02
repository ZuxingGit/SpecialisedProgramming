public class Solution69 {
    public int mySqrt(int x) {
        if (x < 2)
            return x;
        int low = 2, high = x / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high; // Return the floor of the square root
    }

    public static void main(String[] args) {
        Solution69 solution = new Solution69();

        int x1 = 4;
        int result1 = solution.mySqrt(x1);
        System.out.println("Result: " + result1); // Output: 2

        int x2 = 8;
        int result2 = solution.mySqrt(x2);
        System.out.println("Result: " + result2); // Output: 2

        int x3 = 2;
        int result3 = solution.mySqrt(x3);
        System.out.println("Result: " + result3); // Output: 1
    }
}
