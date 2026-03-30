public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;

        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2; // Skip the next bit as well
            } else {
                i += 1; // Move to the next bit
            }
        }

        return i == n - 1; // Check if we ended on the last bit
    }

    public static void main(String[] args) {
        Solution717 solution = new Solution717();

        int[] input = { 1, 0, 0 };
        boolean output = solution.isOneBitCharacter(input);
        System.out.println("Output: " + output);

        input = new int[] { 1, 1, 1, 0 };
        output = solution.isOneBitCharacter(input);
        System.out.println("Output: " + output);

        input = new int[] { 0 };
        output = solution.isOneBitCharacter(input);
        System.out.println("Output: " + output);
    }
}
