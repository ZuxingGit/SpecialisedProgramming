public class Solution405 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hexString = new StringBuilder();
        while (num != 0 && hexString.length() < 8) {
            int hexDigit = num & 0xF;
            hexString.insert(0, hexChars[hexDigit]);
            num >>>= 4;
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        Solution405 solution = new Solution405();

        int num1 = 26;
        String result1 = solution.toHex(num1);
        System.out.println("Hexadecimal of " + num1 + " is: " + result1);

        int num2 = -1;
        String result2 = solution.toHex(num2);
        System.out.println("Hexadecimal of " + num2 + " is: " + result2);
    }
}
