public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution231 sol = new Solution231();

        int n1 = 1;
        System.out.println(sol.isPowerOfTwo(n1));

        int n2 = 16;
        System.out.println(sol.isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println(sol.isPowerOfTwo(n3));
    }
}
