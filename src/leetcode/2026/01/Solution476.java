public class Solution476 {
    public int findComplement(int num) {
        int mask = ~0;
        while ((num & mask) != 0) {
            mask <<= 1;
        }
        return ~num & ~mask;
    }

    public static void main(String[] args) {
        Solution476 solution = new Solution476();

        int num1 = 5;
        System.out.println("Complement of " + num1 + " is: " + solution.findComplement(num1));

        int num2 = 1;
        System.out.println("Complement of " + num2 + " is: " + solution.findComplement(num2));
    }
}
