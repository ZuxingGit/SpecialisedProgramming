package classContent.wk12;

public class NumbersOfIslands {
    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        char[][] grid3 = {{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
        System.out.println(numIslands(grid1));
        System.out.println(numIslands(grid2));
        System.out.println(numIslands(grid3));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= 1 && grid[i - 1][j] == '1')
                    continue;

                if (j >= 1 && grid[i][j - 1] == '1')
                    continue;

                if (grid[i][j] == '1') {
                    count++;
                    BFS(i, j, m, n, grid);
                }
            }
        }
        return count;
    }

    public static void BFS(int i, int j, int m, int n, char[][] grid) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        BFS(i - 1, j, m, n, grid);
        BFS(i, j - 1, m, n, grid);
        BFS(i + 1, j, m, n, grid);
        BFS(i, j + 1, m, n, grid);
    }
}
