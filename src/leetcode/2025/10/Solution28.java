public class Solution28 {
    public static void main(String[] args) {
        Solution28 solution = new Solution28();

        String haystack = "sadbutsad";
        String needle = "sad";
        int result = solution.strStr(haystack, needle);
        System.out.println("Result: " + result); // Output: 0

        haystack = "leetcode";
        needle = "leeto";
        result = solution.strStr(haystack, needle);
        ;
        System.out.println("Result: " + result); // Output: -1
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
