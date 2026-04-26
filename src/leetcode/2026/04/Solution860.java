public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
                if (five < 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution860 solution = new Solution860();

        int[] bills1 = { 5, 5, 5, 10, 20 };
        System.out.println(solution.lemonadeChange(bills1)); // Output: true

        int[] bills2 = { 5, 5, 10, 10, 20 };
        System.out.println(solution.lemonadeChange(bills2)); // Output: false

        int[] bills3 = { 10, 10 };
        System.out.println(solution.lemonadeChange(bills3)); // Output: false
    }
}
