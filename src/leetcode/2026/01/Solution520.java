public class Solution520 {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 0) {
            return true;
        }

        boolean isFirstUpper = Character.isUpperCase(word.charAt(0));
        boolean isSecondUpper = n > 1 && Character.isUpperCase(word.charAt(1));

        for (int i = 1; i < n; i++) {
            boolean isCurrentUpper = Character.isUpperCase(word.charAt(i));
            if (isSecondUpper) {
                if (!isFirstUpper || !isCurrentUpper) {
                    return false;
                }
            } else {
                if (isCurrentUpper) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution520 solution = new Solution520();

        // String word1 = "USA";
        // System.out.println("Is capital use correct for '" + word1 + "'? " +
        // solution.detectCapitalUse(word1));

        // String word2 = "FlaG";
        // System.out.println("Is capital use correct for '" + word2 + "'? " +
        // solution.detectCapitalUse(word2));

        String word3 = "mL";
        System.out.println("Is capital use correct for '" + word3 + "'? " + solution.detectCapitalUse(word3));
    }
}
