public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-indexing
            int remainder = columnNumber % 26;
            title.append((char) (remainder + 'A'));
            columnNumber /= 26;
        }
        return title.reverse().toString();
    }

    public static void main(String[] args) {
        Solution168 solution = new Solution168();

        // Example 1
        int columnNumber1 = 1;
        String result1 = solution.convertToTitle(columnNumber1);
        System.out.println("Example 1: " + result1);
        // Expected: "A"

        // Example 2
        int columnNumber2 = 28;
        String result2 = solution.convertToTitle(columnNumber2);
        System.out.println("Example 2: " + result2);
        // Expected: "AB"

        // Example 3
        int columnNumber3 = 701;
        String result3 = solution.convertToTitle(columnNumber3);
        System.out.println("Example 3: " + result3);
        // Expected: "ZY"
    }
}