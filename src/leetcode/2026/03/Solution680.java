public class Solution680 {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping the left character or the right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution680 solution = new Solution680();

        String s0 = "aba";
        System.out.println(solution.validPalindrome(s0)); // Should print true

        String s1 = "abca";
        System.out.println(solution.validPalindrome(s1)); // Should print true

        String s2 = "abc";
        System.out.println(solution.validPalindrome(s2)); // Should print false
    }
}
