public class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return c;
            }
        }

        return '\0'; // This line should never be reached
    }

    public static void main(String[] args) {
        Solution389 solution = new Solution389();

        String s1 = "abcd";
        String t1 = "abcde";
        char result1 = solution.findTheDifference(s1, t1);
        System.out.println("The added character is: " + result1); // Expected output: 'e'

        String s2 = "";
        String t2 = "y";
        char result2 = solution.findTheDifference(s2, t2);
        System.out.println("The added character is: " + result2); // Expected output: 'y'

        String s3 = "a";
        String t3 = "aa";
        char result3 = solution.findTheDifference(s3, t3);
        System.out.println("The added character is: " + result3); // Expected output: 'a'
    }
}
