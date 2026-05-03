public class Solution883 {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xy = 0, xz = 0, yz = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0)
                    xy++;
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            xz += maxRow;
            yz += maxCol;
        }

        return xy + xz + yz;
    }

    public static void main(String[] args) {
        Solution883 solution = new Solution883();

        int[][] grid1 = { { 1, 2 }, { 3, 4 } };
        System.out.println(solution.projectionArea(grid1)); // Output: 17

        int[][] grid2 = { { 2 } };
        System.out.println(solution.projectionArea(grid2)); // Output: 5

        int[][] grid3 = { { 1, 0 }, { 0, 2 } };
        System.out.println(solution.projectionArea(grid3)); // Output: 8
    }
}
