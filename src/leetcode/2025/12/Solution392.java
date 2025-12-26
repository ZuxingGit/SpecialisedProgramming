public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }

    public static void main(String[] args) {
        Solution392 solution = new Solution392();

        String s1 = "abc";
        String t1 = "ahbgdc";
        boolean result1 = solution.isSubsequence(s1, t1);
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + result1); // Expected output: true

        String s2 = "axc";
        String t2 = "ahbgdc";
        boolean result2 = solution.isSubsequence(s2, t2);
        System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + result2); // Expected output: false
    }
}
