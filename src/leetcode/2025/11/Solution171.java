public class Solution171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution171 solution = new Solution171();

        // Example 1
        String columnTitle1 = "A";
        int result1 = solution.titleToNumber(columnTitle1);
        System.out.println("Example 1: " + result1);
        // Expected: 1

        // Example 2
        String columnTitle2 = "AB";
        int result2 = solution.titleToNumber(columnTitle2);
        System.out.println("Example 2: " + result2);
        // Expected: 28

        // Example 3
        String columnTitle3 = "ZY";
        int result3 = solution.titleToNumber(columnTitle3);
        System.out.println("Example 3: " + result3);
        // Expected: 701
    }
}
