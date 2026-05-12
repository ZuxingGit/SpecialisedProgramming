public class Solution914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int card : deck) {
            count[card]++;
        }

        int gcd = 0;
        for (int c : count) {
            if (c > 0) {
                gcd = gcd(gcd, c);
            }
        }

        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution914 solution = new Solution914();

        int[] deck1 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        boolean result1 = solution.hasGroupsSizeX(deck1);
        System.out.println(result1); // Output: true

        int[] deck2 = { 1, 1, 1, 2, 2, 2, 3, 3 };
        boolean result2 = solution.hasGroupsSizeX(deck2);
        System.out.println(result2); // Output: false

        int[] deck3 = { 1 };
        boolean result3 = solution.hasGroupsSizeX(deck3);
        System.out.println(result3); // Output: false
    }
}
