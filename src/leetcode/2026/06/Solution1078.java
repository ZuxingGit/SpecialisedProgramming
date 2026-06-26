import java.util.ArrayList;
import java.util.List;

public class Solution1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution1078 solution = new Solution1078();

        String text1 = "alice is a good girl she is a good student";
        String first1 = "a";
        String second1 = "good";
        String[] result1 = solution.findOcurrences(text1, first1, second1);
        for (String word : result1) {
            System.out.println(word);
        }

        String text2 = "we will we will rock you";
        String first2 = "we";
        String second2 = "will";
        String[] result2 = solution.findOcurrences(text2, first2, second2);
        for (String word : result2) {
            System.out.println(word);
        }
    }
}
