public class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder base7 = new StringBuilder();

        while (num > 0) {
            base7.append(num % 7);
            num /= 7;
        }

        if (isNegative) {
            base7.append("-");
        }

        return base7.reverse().toString();
    }

    public static void main(String[] args) {
        Solution504 solution = new Solution504();

        int num1 = 100;
        System.out.println("Base 7 of " + num1 + " is: " + solution.convertToBase7(num1));

        int num2 = -7;
        System.out.println("Base 7 of " + num2 + " is: " + solution.convertToBase7(num2));
    }
}
