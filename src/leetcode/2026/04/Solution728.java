import java.util.List;

public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new java.util.ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution728 solution = new Solution728();

        int left = 1, right = 22;
        List<Integer> output = solution.selfDividingNumbers(left, right);
        System.out.println("Output: " + output);

        left = 47;
        right = 85;
        output = solution.selfDividingNumbers(left, right);
        System.out.println("Output: " + output);
    }
}
