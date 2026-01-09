public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;

                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        Solution463 solution = new Solution463();

        int[][] grid1 = {
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 0, 0 }
        };
        System.out.println("Island Perimeter: " + solution.islandPerimeter(grid1));

        int[][] grid2 = {
                { 1, 1 },
                { 1, 1 }
        };
        System.out.println("Island Perimeter: " + solution.islandPerimeter(grid2));
    }
}
