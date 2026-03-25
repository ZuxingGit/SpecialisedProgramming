public class Solution696 {
    public int countBinarySubstrings(String s) {
        int prevRunLength = 0;
        int curRunLength = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curRunLength++;
            } else {
                prevRunLength = curRunLength;
                curRunLength = 1;
            }
            if (prevRunLength >= curRunLength) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution696 solution = new Solution696();

        String s = "00110011";
        int result = solution.countBinarySubstrings(s);
        System.out.println(result); // Output: 6

        s = "10101";
        result = solution.countBinarySubstrings(s);
        System.out.println(result); // Output: 4
    }
}
