public class Solution868 {
    public int binaryGap(int n) {
        int maxGap = 0;
        int previousIndex = -1;

        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) { // Check if the i-th bit is set
                if (previousIndex != -1) {
                    maxGap = Math.max(maxGap, i - previousIndex);
                }
                previousIndex = i; // Update the index of the last seen '1'
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        Solution868 solution = new Solution868();

        int n1 = 22; // Binary: 10110
        System.out.println(solution.binaryGap(n1)); // Output: 2

        int n2 = 5; // Binary: 101
        System.out.println(solution.binaryGap(n2)); // Output: 2

        int n3 = 6; // Binary: 110
        System.out.println(solution.binaryGap(n3)); // Output: 1

        int n4 = 8; // Binary: 1000
        System.out.println(solution.binaryGap(n4)); // Output: 0
    }
}
