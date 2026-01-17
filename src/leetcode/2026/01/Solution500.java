import java.util.ArrayList;
import java.util.List;

public class Solution500 {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isInRow(word, row1) || isInRow(word, row2) || isInRow(word, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean isInRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution500 solution = new Solution500();

        String[] words1 = { "Hello", "Alaska", "Dad", "Peace" };
        String[] result1 = solution.findWords(words1);
        System.out.print("Words that can be typed using one row: ");
        for (String word : result1) {
            System.out.print(word + " ");
        }
        System.out.println();

        String[] words2 = { "omk" };
        String[] result2 = solution.findWords(words2);
        System.out.print("Words that can be typed using one row: ");
        for (String word : result2) {
            System.out.print(word + " ");
        }
        System.out.println();

        String[] words3 = { "adsdf", "sfd" };
        String[] result3 = solution.findWords(words3);
        System.out.print("Words that can be typed using one row: ");
        for (String word : result3) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}