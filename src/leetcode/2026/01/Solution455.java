public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        java.util.Arrays.sort(g);
        java.util.Arrays.sort(s);
        int childIndex = 0;
        int cookieIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }

    public static void main(String[] args) {
        Solution455 solution = new Solution455();

        int[] g1 = { 1, 2, 3 };
        int[] s1 = { 1, 1 };
        System.out.println("Maximum number of content children: " + solution.findContentChildren(g1, s1));

        int[] g2 = { 1, 2 };
        int[] s2 = { 1, 2, 3 };
        System.out.println("Maximum number of content children: " + solution.findContentChildren(g2, s2));
    }
}
