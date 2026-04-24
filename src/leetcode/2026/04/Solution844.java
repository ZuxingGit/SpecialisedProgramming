public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution844 solution = new Solution844();

        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println(solution.backspaceCompare(s1, t1)); // Output: true

        String s2 = "ab##";
        String t2 = "c#d#";
        System.out.println(solution.backspaceCompare(s2, t2)); // Output: true

        String s3 = "a##c";
        String t3 = "#a#c";
        System.out.println(solution.backspaceCompare(s3, t3)); // Output: true

        String s4 = "a#c";
        String t4 = "b";
        System.out.println(solution.backspaceCompare(s4, t4)); // Output: false
    }
}
