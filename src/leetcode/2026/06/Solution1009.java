public class Solution1009 {
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;

        int mask = 1;
        while (mask <= n) {
            mask <<= 1;
        }
        return n ^ (mask - 1);
    }

    public static void main(String[] args) {
        Solution1009 solution = new Solution1009();

        int n1 = 5;
        System.out.println(solution.bitwiseComplement(n1)); // Output: 2

        int n2 = 7;
        System.out.println(solution.bitwiseComplement(n2)); // Output: 0

        int n3 = 10;
        System.out.println(solution.bitwiseComplement(n3)); // Output: 5
    }
}
