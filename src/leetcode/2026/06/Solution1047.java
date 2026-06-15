public class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int length = sb.length();
            if (length > 0 && sb.charAt(length - 1) == c) {
                sb.deleteCharAt(length - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1047 solution = new Solution1047();

        String s1 = "abbaca";
        String result1 = solution.removeDuplicates(s1);
        System.out.println(result1); // Output: "ca"

        String s2 = "azxxzy";
        String result2 = solution.removeDuplicates(s2);
        System.out.println(result2); // Output: "ay"
    }
}
