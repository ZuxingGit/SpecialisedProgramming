class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution326 solution = new Solution326();
        System.out.println(solution.isPowerOfThree(27)); // true
        System.out.println(solution.isPowerOfThree(0)); // false
        System.out.println(solution.isPowerOfThree(1)); // true
        System.out.println(solution.isPowerOfThree(-1)); // false
        System.out.println(solution.isPowerOfThree(9)); // true
        System.out.println(solution.isPowerOfThree(45)); // false
    }
}