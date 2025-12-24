public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution383 solution = new Solution383();

        String ransomNote1 = "a";
        String magazine1 = "b";
        boolean result1 = solution.canConstruct(ransomNote1, magazine1);
        System.out.println("Can construct ransom note: " + result1); // Expected output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean result2 = solution.canConstruct(ransomNote2, magazine2);
        System.out.println("Can construct ransom note: " + result2); // Expected output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        boolean result3 = solution.canConstruct(ransomNote3, magazine3);
        System.out.println("Can construct ransom note: " + result3); // Expected output: true
    }
}
