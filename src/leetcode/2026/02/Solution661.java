public class Solution661 {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];
        int[] dx = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;
                for (int k = 0; k < 9; k++) {
                    int ni = i + dx[k], nj = j + dy[k];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        sum += img[ni][nj];
                        count++;
                    }
                }
                res[i][j] = sum / count;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution661 solution = new Solution661();

        int[][] img1 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] result1 = solution.imageSmoother(img1);
        for (int[] row : result1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] img2 = { { 100, 200, 100 }, { 200, 50, 200 }, { 100, 200, 100 } };
        int[][] result2 = solution.imageSmoother(img2);
        for (int[] row : result2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
