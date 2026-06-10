public class Solution1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution1021 solution = new Solution1021();

        String s1 = "(()())(())";
        System.out.println(solution.removeOuterParentheses(s1)); // Output: "()()()"

        String s2 = "(()())(())(()(()))";
        System.out.println(solution.removeOuterParentheses(s2)); // Output: "()()()()(())"

        String s3 = "()()";
        System.out.println(solution.removeOuterParentheses(s3)); // Output: ""
    }
}
