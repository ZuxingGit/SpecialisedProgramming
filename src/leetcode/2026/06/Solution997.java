public class Solution997 {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        for (int[] t : trust) {
            outDegree[t[0]]++;
            inDegree[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            // if trusted by everyone else and trusts no one
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution997 solution = new Solution997();

        int n1 = 2;
        int[][] trust1 = { { 1, 2 } };
        System.out.println("Output for test case 1: " + solution.findJudge(n1, trust1)); // Output: 2

        int n2 = 3;
        int[][] trust2 = { { 1, 3 }, { 2, 3 } };
        System.out.println("Output for test case 2: " + solution.findJudge(n2, trust2)); // Output: 3

        int n3 = 3;
        int[][] trust3 = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
        System.out.println("Output for test case 3: " + solution.findJudge(n3, trust3)); // Output: -1
    }
}
