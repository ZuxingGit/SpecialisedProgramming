import java.util.List;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new java.util.ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution412 solution = new Solution412();

        int n1 = 15;
        List<String> result1 = solution.fizzBuzz(n1);
        System.out.println("FizzBuzz up to " + n1 + ": " + result1);

        int n2 = 5;
        List<String> result2 = solution.fizzBuzz(n2);
        System.out.println("FizzBuzz up to " + n2 + ": " + result2);

        int n3 = 1;
        List<String> result3 = solution.fizzBuzz(n3);
        System.out.println("FizzBuzz up to " + n3 + ": " + result3);

        int n4 = 3;
        List<String> result4 = solution.fizzBuzz(n4);
        System.out.println("FizzBuzz up to " + n4 + ": " + result4);
    }
}
