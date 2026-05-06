class Solution892 {
    public int surfaceArea(int[][] grid) {
        int surfaceArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    // Top and bottom surfaces
                    surfaceArea += 2;

                    // Front and back surfaces
                    surfaceArea += 4 * grid[i][j];

                    // Left and right surfaces
                    if (i > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
                    }
                    if (j > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                    }
                }
            }
        }

        return surfaceArea;
    }

    public static void main(String[] args) {
        Solution892 solution = new Solution892();

        int[][] grid1 = { { 1, 2 }, { 3, 4 } };
        System.out.println(solution.surfaceArea(grid1)); // Output: 34

        int[][] grid2 = { { 1, 0 }, { 0, 2 } };
        System.out.println(solution.surfaceArea(grid2)); // Output: 16

        int[][] grid3 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println(solution.surfaceArea(grid3)); // Output: 32

        int[][] grid4 = { { 2, 2, 2 }, { 2, 1, 2 }, { 2, 2, 2 } };
        System.out.println(solution.surfaceArea(grid4)); // Output: 46
    }
}