public class Solution258 {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        Solution258 sol = new Solution258();

        int num1 = 38;
        int answer1 = sol.addDigits(num1);
        System.out.println(answer1);

        int num2 = 0;
        int answer2 = sol.addDigits(num2);
        System.out.println(answer2);
    }
}
