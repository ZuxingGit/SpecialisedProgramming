public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;

        if (originalRows * originalCols != r * c) {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];
        for (int i = 0; i < originalRows * originalCols; i++) {
            reshapedMatrix[i / c][i % c] = mat[i / originalCols][i % originalCols];
        }

        return reshapedMatrix;
    }

    public static void main(String[] args) {
        Solution566 solution = new Solution566();

        // Example 1
        int[][] mat1 = { { 1, 2 }, { 3, 4 } };
        int r1 = 1;
        int c1 = 4;
        int[][] output1 = solution.matrixReshape(mat1, r1, c1);
        for (int[] row : output1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Output:
        // 1 2 3 4

        // Example 2
        int[][] mat2 = { { 1, 2 }, { 3, 4 } };
        int r2 = 2;
        int c2 = 4;
        int[][] output2 = solution.matrixReshape(mat2, r2, c2);
        for (int[] row : output2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        // Output:
        // 1 2
        // 3 4
    }
}
