import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        int[] charToIndex = new int[26];
        Map<String, Integer> wordToIndex = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            int patternIndex = charToIndex[c - 'a'];
            int wordIndex = wordToIndex.getOrDefault(word, 0);

            if (patternIndex != wordIndex) {
                return false;
            }

            charToIndex[c - 'a'] = i + 1;
            wordToIndex.put(word, i + 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Solution290 solution = new Solution290();

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern1, s1)); // true

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern2, s2)); // false

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern3, s3)); // false

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println(solution.wordPattern(pattern4, s4)); // false
    }
}
