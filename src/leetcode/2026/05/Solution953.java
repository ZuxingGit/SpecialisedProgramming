public class Solution953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] charOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            charOrder[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            int minLength = Math.min(word1.length(), word2.length());
            boolean isSorted = false;

            for (int j = 0; j < minLength; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                if (c1 != c2) {
                    if (charOrder[c1 - 'a'] > charOrder[c2 - 'a']) {
                        return false;
                    }
                    isSorted = true;
                    break;
                }
            }

            if (!isSorted && word1.length() > word2.length()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution953 solution = new Solution953();

        String[] words1 = { "hello", "leetcode" };
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        boolean result1 = solution.isAlienSorted(words1, order1);
        System.out.println("Output for words1: " + result1); // Output: true

        String[] words2 = { "word", "world", "row" };
        String order2 = "worldabcefghijkmnpqstuvxyz";
        boolean result2 = solution.isAlienSorted(words2, order2);
        System.out.println("Output for words2: " + result2); // Output: false

        String[] words3 = { "apple", "app" };
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        boolean result3 = solution.isAlienSorted(words3, order3);
        System.out.println("Output for words3: " + result3); // Output: false
    }
}
