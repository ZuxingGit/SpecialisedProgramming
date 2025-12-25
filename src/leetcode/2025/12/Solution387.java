public class Solution387 {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution387 solution = new Solution387();

        String s1 = "leetcode";
        int result1 = solution.firstUniqChar(s1);
        System.out.println("First unique character index: " + result1); // Expected output: 0

        String s2 = "loveleetcode";
        int result2 = solution.firstUniqChar(s2);
        System.out.println("First unique character index: " + result2); // Expected output: 2

        String s3 = "aabb";
        int result3 = solution.firstUniqChar(s3);
        System.out.println("First unique character index: " + result3); // Expected output: -1
    }
}
