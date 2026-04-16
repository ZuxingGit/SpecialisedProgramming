public class Solution806 {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;

        for (char c : s.toCharArray()) {
            int charWidth = widths[c - 'a'];
            if (width + charWidth > 100) {
                lines++;
                width = charWidth;
            } else {
                width += charWidth;
            }
        }

        return new int[] { lines, width };
    }

    public static void main(String[] args) {
        Solution806 solution = new Solution806();

        int[] widths1 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10 };
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] result1 = solution.numberOfLines(widths1, s1);
        System.out.println(result1[0] + ", " + result1[1]); // Output: 3, 60

        int[] widths2 = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10 };
        String s2 = "bbbcccdddaaa";
        int[] result2 = solution.numberOfLines(widths2, s2);
        System.out.println(result2[0] + ", " + result2[1]); // Output: 2, 4
    }
}
