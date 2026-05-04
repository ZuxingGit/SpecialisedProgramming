import java.util.*;

public class Solution884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words1) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        List<String> uncommonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution884 solution = new Solution884();

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(solution.uncommonFromSentences(s1, s2))); // Output: ["sweet", "sour"]

        String s3 = "apple apple";
        String s4 = "banana";
        System.out.println(Arrays.toString(solution.uncommonFromSentences(s3, s4))); // Output: ["banana"]
    }
}
