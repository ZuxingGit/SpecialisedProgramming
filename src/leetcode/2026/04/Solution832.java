public class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 1 - image[i][n - 1 - j];
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution832 solution = new Solution832();

        int[][] image1 = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result1 = solution.flipAndInvertImage(image1);
        printMatrix(result1); // Output: [[1, 0, 0], [0, 1, 0], [1, 1, 1]]

        int[][] image2 = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        int[][] result2 = solution.flipAndInvertImage(image2);
        printMatrix(result2); // Output: [[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]
    }
}
