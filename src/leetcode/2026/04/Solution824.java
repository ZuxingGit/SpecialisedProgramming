public class Solution824 {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.indexOf(word.charAt(0)) != -1) {
                result.append(word);
            } else {
                result.append(word.substring(1)).append(word.charAt(0));
            }
            result.append("ma");
            for (int j = 0; j <= i; j++) {
                result.append("a");
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution824 solution = new Solution824();

        String sentence1 = "I speak Goat Latin";
        String result1 = solution.toGoatLatin(sentence1);
        System.out.println(result1); // Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

        String sentence2 = "The quick brown fox jumped over the lazy dog";
        String result2 = solution.toGoatLatin(sentence2);
        System.out.println(result2); // Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa
                                     // hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    }
}
