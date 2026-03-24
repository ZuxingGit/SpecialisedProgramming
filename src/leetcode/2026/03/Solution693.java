public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int prevBit = n & 1; // Get the least significant bit
        n >>= 1; // Right shift to process the next bit

        while (n > 0) {
            int currentBit = n & 1; // Get the current least significant bit
            if (currentBit == prevBit) {
                return false; // If two adjacent bits are the same, return false
            }
            prevBit = currentBit; // Update prevBit for the next iteration
            n >>= 1; // Right shift to process the next bit
        }

        return true; // All bits are alternating
    }

    public static void main(String[] args) {
        Solution693 solution = new Solution693();

        int n0 = 5; // Binary: 101
        System.out.println(solution.hasAlternatingBits(n0)); // Should print true

        int n1 = 7; // Binary: 111
        System.out.println(solution.hasAlternatingBits(n1)); // Should print false

        int n2 = 11; // Binary: 1011
        System.out.println(solution.hasAlternatingBits(n2)); // Should print false

        int n3 = 10; // Binary: 1010
        System.out.println(solution.hasAlternatingBits(n3)); // Should print true
    }
}
