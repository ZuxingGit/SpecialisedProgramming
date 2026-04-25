public class Solution859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        }

        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }

    public static void main(String[] args) {
        Solution859 solution = new Solution859();

        String s1 = "ab";
        String goal1 = "ba";
        System.out.println(solution.buddyStrings(s1, goal1)); // Output: true

        String s2 = "ab";
        String goal2 = "ab";
        System.out.println(solution.buddyStrings(s2, goal2)); // Output: false

        String s3 = "aa";
        String goal3 = "aa";
        System.out.println(solution.buddyStrings(s3, goal3)); // Output: true

        String s4 = "aaaaaaabc";
        String goal4 = "aaaaaaacb";
        System.out.println(solution.buddyStrings(s4, goal4)); // Output: true
    }
}
