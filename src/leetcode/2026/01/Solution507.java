public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1; // 1 is a proper divisor
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                sum += i;
                int otherDivisor = num / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Solution507 solution = new Solution507();

        int num1 = 28;
        System.out.println("Is " + num1 + " a perfect number? " + solution.checkPerfectNumber(num1));

        int num2 = 12;
        System.out.println("Is " + num2 + " a perfect number? " + solution.checkPerfectNumber(num2));
    }
}