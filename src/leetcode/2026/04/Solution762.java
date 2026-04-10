public class Solution762 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution762 solution = new Solution762();

        int left = 6, right = 10;
        int output = solution.countPrimeSetBits(left, right);
        System.out.println("Output: " + output);

        left = 10;
        right = 15;
        output = solution.countPrimeSetBits(left, right);
        System.out.println("Output: " + output);
    }
}
