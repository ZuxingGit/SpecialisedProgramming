import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int n = num.length;
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + k % 10 + carry;
            carry = sum / 10;
            result.add(sum % 10);
            k /= 10;
        }
        while (k > 0) {
            int sum = k % 10 + carry;
            carry = sum / 10;
            result.add(sum % 10);
            k /= 10;
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Solution989 solution = new Solution989();

        int[] num1 = { 1, 2, 0, 0 };
        int k1 = 34;
        List<Integer> result1 = solution.addToArrayForm(num1, k1);
        System.out.print("Output for num1 and k1: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println(); // Output: [1, 2, 3, 4]

        int[] num2 = { 2, 7, 4 };
        int k2 = 181;
        List<Integer> result2 = solution.addToArrayForm(num2, k2);
        System.out.print("Output for num2 and k2: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println(); // Output: [4, 5, 5]

        int[] num3 = { 2, 1, 5 };
        int k3 = 806;
        List<Integer> result3 = solution.addToArrayForm(num3, k3);
        System.out.print("Output for num3 and k3: ");
        for (int digit : result3) {
            System.out.print(digit + " ");
        }
        System.out.println(); // Output: [1, 0, 2, 1]
    }
}
