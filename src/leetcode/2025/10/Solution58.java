public class Solution58 {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution58 solution = new Solution58();

        String s1 = "Hello World";
        int result1 = solution.lengthOfLastWord(s1);
        System.out.println("Result: " + result1); // Output: 5

        String s2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(s2);
        System.out.println("Result: " + result2); // Output: 4

        String s3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(s3);
        System.out.println("Result: " + result3); // Output: 6

        String s4 = "a ";
        int result4 = solution.lengthOfLastWord(s4);
        System.out.println("Result: " + result4); // Output: 1
    }
}
