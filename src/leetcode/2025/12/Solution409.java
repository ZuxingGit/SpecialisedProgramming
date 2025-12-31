public class Solution409 {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[52]; // 26 for 'a'-'z' and 26 for 'A'-'Z'
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCounts[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                charCounts[c - 'A' + 26]++;
            }
        }

        int length = 0;
        boolean hasOddCount = false;
        for (int count : charCounts) {
            length += (count / 2) * 2; // Add the largest even number less than or equal to count
            if (count % 2 == 1) {
                hasOddCount = true; // There is at least one character with an odd count
            }
        }

        // If there is any character with an odd count, we can place one in the center
        if (hasOddCount) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution409 solution = new Solution409();

        String s1 = "abccccdd";
        int result1 = solution.longestPalindrome(s1);
        System.out.println("Longest palindrome length for \"" + s1 + "\": " + result1);

        String s2 = "aA";
        int result2 = solution.longestPalindrome(s2);
        System.out.println("Longest palindrome length for \"" + s2 + "\": " + result2);

        String s3 = "abc";
        int result3 = solution.longestPalindrome(s3);
        System.out.println("Longest palindrome length for \"" + s3 + "\": " + result3);

        String s4 = "a";
        int result4 = solution.longestPalindrome(s4);
        System.out.println("Longest palindrome length for \"" + s4 + "\": " + result4);

        String s5 = "";
        int result5 = solution.longestPalindrome(s5);
        System.out.println("Longest palindrome length for an empty string: " + result5);
    }
}
