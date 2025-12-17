public class Solution342 {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution342 solution = new Solution342();
        System.out.println(solution.isPowerOfFour(16)); // true
        System.out.println(solution.isPowerOfFour(5)); // false
        System.out.println(solution.isPowerOfFour(1)); // true
        System.out.println(solution.isPowerOfFour(-4)); // false
        System.out.println(solution.isPowerOfFour(64)); // true
        System.out.println(solution.isPowerOfFour(20)); // false
    }
}
