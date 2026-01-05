public class Solution441 {
    public int arrangeCoins(int n) {
        int left = 0, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Calculate the total coins needed for 'mid' complete rows
            long coinsNeeded = (long) mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                return mid;
            } else if (coinsNeeded < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Solution441 solution = new Solution441();

        int n1 = 5;
        System.out.println("Number of complete rows for " + n1 + " coins: " + solution.arrangeCoins(n1));

        int n2 = 8;
        System.out.println("Number of complete rows for " + n2 + " coins: " + solution.arrangeCoins(n2));

        int n3 = 1;
        System.out.println("Number of complete rows for " + n3 + " coins: " + solution.arrangeCoins(n3));

        int n4 = 0;
        System.out.println("Number of complete rows for " + n4 + " coins: " + solution.arrangeCoins(n4));

        int n5 = 10;
        System.out.println("Number of complete rows for " + n5 + " coins: " + solution.arrangeCoins(n5));
    }
}
