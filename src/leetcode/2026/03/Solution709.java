public class Solution709 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Solution709 solution = new Solution709();

        String input = "Hello";
        String output = solution.toLowerCase(input);
        System.out.println("Output: " + output);

        input = "here";
        output = solution.toLowerCase(input);
        System.out.println("Output: " + output);

        input = "LOVELY";
        output = solution.toLowerCase(input);
        System.out.println("Output: " + output);
    }
}
