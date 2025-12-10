public class Solution263 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution263 sol = new Solution263();

        int n1 = 6;
        boolean answer1 = sol.isUgly(n1);
        System.out.println(answer1);

        int n2 = 8;
        boolean answer2 = sol.isUgly(n2);
        System.out.println(answer2);

        int n3 = 14;
        boolean answer3 = sol.isUgly(n3);
        System.out.println(answer3);

        int n4 = 1;
        boolean answer4 = sol.isUgly(n4);
        System.out.println(answer4);
    }
}
