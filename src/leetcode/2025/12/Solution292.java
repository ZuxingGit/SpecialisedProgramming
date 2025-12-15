public class Solution292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Solution292 solution = new Solution292();

        int n1 = 4;
        System.out.println(solution.canWinNim(n1)); // false

        int n2 = 1;
        System.out.println(solution.canWinNim(n2)); // true

        int n3 = 2;
        System.out.println(solution.canWinNim(n3)); // true

        int n4 = 7;
        System.out.println(solution.canWinNim(n4)); // true
    }
}
