public class Solution521 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        Solution521 solution = new Solution521();

        String a1 = "aba";
        String b1 = "cdc";
        System.out.println("The length of the longest uncommon subsequence between '" + a1 + "' and '" + b1 + "' is: " +
                solution.findLUSlength(a1, b1));

        String a2 = "aaa";
        String b2 = "aaa";
        System.out.println("The length of the longest uncommon subsequence between '" + a2 + "' and '" + b2 + "' is: " +
                solution.findLUSlength(a2, b2));
    }
}
