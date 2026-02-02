public class Solution575 {
    public int distributeCandies(int[] candyType) {
        boolean[] seen = new boolean[200001];
        int uniqueCount = 0;
        for (int candy : candyType) {
            if (!seen[candy + 100000]) {
                seen[candy + 100000] = true;
                uniqueCount++;
            }
        }
        return Math.min(uniqueCount, candyType.length / 2);
    }

    public static void main(String[] args) {
        Solution575 solution = new Solution575();

        // Example 1
        int[] candyType1 = { 1, 1, 2, 2, 3, 3 };
        int output1 = solution.distributeCandies(candyType1);
        System.out.println(output1); // Output: 3

        // Example 2
        int[] candyType2 = { 1, 1, 2, 3 };
        int output2 = solution.distributeCandies(candyType2);
        System.out.println(output2); // Output: 2
    }
}
