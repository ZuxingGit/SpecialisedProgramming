public class Solution867 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        Solution867 solution = new Solution867();

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] transposed1 = solution.transpose(matrix1);
        printMatrix(transposed1); // Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] matrix2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] transposed2 = solution.transpose(matrix2);
        printMatrix(transposed2); // Output: [[1,3,5],[2,4,6]]

        int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] transposed3 = solution.transpose(matrix3);
        printMatrix(transposed3); // Output: [[1,4],[2,5],[3,6]]
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
}
