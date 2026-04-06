public class Solution748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] count = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                count[Character.toLowerCase(c) - 'a']++;
            }
        }
        String result = null;
        for (String word : words) {
            if (isCompletingWord(word, count)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    private boolean isCompletingWord(String word, int[] count) {
        int[] wordCount = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                wordCount[Character.toLowerCase(c) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] < count[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution748 solution = new Solution748();

        String licensePlate = "1s3 PSt";
        String[] words = { "step", "steps", "stripe", "stepple" };
        String output = solution.shortestCompletingWord(licensePlate, words);
        System.out.println("Output: " + output);

        licensePlate = "1s3 456";
        words = new String[] { "looks", "pest", "stew", "show" };
        output = solution.shortestCompletingWord(licensePlate, words);
        System.out.println("Output: " + output);
    }
}
