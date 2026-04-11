public class Solution766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution766 solution = new Solution766();

        int[][] matrix = { { 1, 2, 3 }, { 5, 1, 2 }, { 9, 5, 1 } };
        boolean output = solution.isToeplitzMatrix(matrix);
        System.out.println("Output: " + output);

        matrix = new int[][] { { 1, 2 }, { 2, 2 } };
        output = solution.isToeplitzMatrix(matrix);
        System.out.println("Output: " + output);
    }
}
