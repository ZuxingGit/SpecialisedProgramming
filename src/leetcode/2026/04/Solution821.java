public class Solution821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        int prev = Integer.MIN_VALUE / 2; // Use a large negative value to avoid overflow

        // First pass: left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
                continue;
            }
            result[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2; // Use a large positive value to avoid overflow

        // Second pass: right to left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
                continue;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution821 solution = new Solution821();

        String s1 = "loveleetcode";
        char c1 = 'e';
        int[] result1 = solution.shortestToChar(s1, c1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

        String s2 = "aaab";
        char c2 = 'b';
        int[] result2 = solution.shortestToChar(s2, c2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [3, 2, 1, 0]
    }
}
