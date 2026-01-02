public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution415 solution = new Solution415();

        String num1a = "11";
        String num2a = "123";
        System.out.println("Sum of " + num1a + " and " + num2a + ": " + solution.addStrings(num1a, num2a));

        String num1b = "456";
        String num2b = "77";
        System.out.println("Sum of " + num1b + " and " + num2b + ": " + solution.addStrings(num1b, num2b));

        String num1c = "0";
        String num2c = "0";
        System.out.println("Sum of " + num1c + " and " + num2c + ": " + solution.addStrings(num1c, num2c));

        String num1d = "999";
        String num2d = "1";
        System.out.println("Sum of " + num1d + " and " + num2d + ": " + solution.addStrings(num1d, num2d));
    }
}
