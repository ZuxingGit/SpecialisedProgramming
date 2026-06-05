import java.util.List;

public class Solution1002 {
    public List<String> commonChars(String[] words) {
        int[] charCount = new int[26];
        for (char c : words[0].toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] currentCount = new int[26];
            for (char c : words[i].toCharArray()) {
                currentCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                charCount[j] = Math.min(charCount[j], currentCount[j]);
            }
        }

        List<String> result = new java.util.ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < charCount[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1002 solution = new Solution1002();

        String[] words1 = { "bella", "label", "roller" };
        System.out.println(solution.commonChars(words1)); // Output: ["e", "l", "l"]

        String[] words2 = { "cool", "lock", "cook" };
        System.out.println(solution.commonChars(words2)); // Output: ["c", "o"]
    }
}
