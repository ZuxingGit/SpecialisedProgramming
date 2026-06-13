public class Solution1030 {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index][0] = i;
                result[index][1] = j;
                index++;
            }
        }
        java.util.Arrays.sort(result, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });
        return result;
    }

    public static void main(String[] args) {
        Solution1030 solution = new Solution1030();

        int rows1 = 1, cols1 = 2, rCenter1 = 0, cCenter1 = 0;
        int[][] result1 = solution.allCellsDistOrder(rows1, cols1, rCenter1, cCenter1);
        for (int[] cell : result1) {
            System.out.println(java.util.Arrays.toString(cell)); // Output: [[0,0],[0,1]]
        }

        int rows2 = 2, cols2 = 2, rCenter2 = 0, cCenter2 = 1;
        int[][] result2 = solution.allCellsDistOrder(rows2, cols2, rCenter2, cCenter2);
        for (int[] cell : result2) {
            System.out.println(java.util.Arrays.toString(cell)); // Output: [[0,1],[0,0],[1,1],[1,0]]
        }

        int rows3 = 2, cols3 = 3, rCenter3 = 1, cCenter3 = 2;
        int[][] result3 = solution.allCellsDistOrder(rows3, cols3, rCenter3, cCenter3);
        for (int[] cell : result3) {
            System.out.println(java.util.Arrays.toString(cell)); // Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
        }
    }
}
