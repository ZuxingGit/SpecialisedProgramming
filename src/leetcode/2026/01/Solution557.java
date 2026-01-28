public class Solution557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Solution557 solution = new Solution557();

        String input1 = "Let's take LeetCode contest";
        String output1 = solution.reverseWords(input1);
        System.out.println(output1); // Output: "s'teL ekat edoCteeL tsetnoc"

        String input2 = "Mr Ding";
        String output2 = solution.reverseWords(input2);
        System.out.println(output2); // Output: "rM gniD"

    }
}
