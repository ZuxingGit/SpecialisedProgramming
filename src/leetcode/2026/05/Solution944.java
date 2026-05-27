public class Solution944 {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs[0].length(); // length of each string
        int m = strs.length; // number of strings
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution944 solution = new Solution944();

        String[] strs1 = { "cba", "daf", "ghi" };
        int result1 = solution.minDeletionSize(strs1);
        System.out.println("Output for strs1: " + result1); // Output: 1

        String[] strs2 = { "a", "b" };
        int result2 = solution.minDeletionSize(strs2);
        System.out.println("Output for strs2: " + result2); // Output: 0

        String[] strs3 = { "zyx", "wvu", "tsr" };
        int result3 = solution.minDeletionSize(strs3);
        System.out.println("Output for strs3: " + result3); // Output: 3
    }
}
