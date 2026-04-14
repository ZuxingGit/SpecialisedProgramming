public class Solution796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        Solution796 solution = new Solution796();

        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println(solution.rotateString(s1, goal1)); // Output: true

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println(solution.rotateString(s2, goal2)); // Output: false
    }
}
