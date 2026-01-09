public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }
        return distance;
    }

    public static void main(String[] args) {
        Solution461 solution = new Solution461();

        int x1 = 1, y1 = 4;
        System.out
                .println("Hamming Distance between " + x1 + " and " + y1 + " is: " + solution.hammingDistance(x1, y1));

        int x2 = 3, y2 = 1;
        System.out
                .println("Hamming Distance between " + x2 + " and " + y2 + " is: " + solution.hammingDistance(x2, y2));
    }
}
