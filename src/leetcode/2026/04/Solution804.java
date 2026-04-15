import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        Set<String> uniqueTransformations = new HashSet<>();
        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (char c : word.toCharArray()) {
                transformation.append(morse[c - 'a']);
            }
            uniqueTransformations.add(transformation.toString());
        }
        return uniqueTransformations.size();
    }

    public static void main(String[] args) {
        Solution804 solution = new Solution804();

        String[] words1 = { "gin", "zen", "gig", "msg" };
        System.out.println(solution.uniqueMorseRepresentations(words1)); // Output: 2

        String[] words2 = { "a" };
        System.out.println(solution.uniqueMorseRepresentations(words2)); // Output: 1
    }
}
