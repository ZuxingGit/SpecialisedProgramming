public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String substring = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution459 solution = new Solution459();

        String s1 = "abab";
        System.out.println(
                "Does \"" + s1 + "\" have a repeated substring pattern? " + solution.repeatedSubstringPattern(s1));

        String s2 = "aba";
        System.out.println(
                "Does \"" + s2 + "\" have a repeated substring pattern? " + solution.repeatedSubstringPattern(s2));

        String s3 = "abcabcabcabc";
        System.out.println(
                "Does \"" + s3 + "\" have a repeated substring pattern? " + solution.repeatedSubstringPattern(s3));
    }
}
