package classContent.wk11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        int[][] a2 = {{1}};
        pacificAtlantic(a1);
        pacificAtlantic(a2);
    }

    static int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rowSize = heights.length;
        int colSize = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] hasVisitedP = new boolean[rowSize][colSize];
        boolean[][] hasVisitedA = new boolean[rowSize][colSize];
        Queue<List<Integer>> pacificQueue = new LinkedList<>();
        Queue<List<Integer>> atlanticQueue = new LinkedList<>();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (i == 0 || j == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    pacificQueue.add(list);
                    hasVisitedP[i][j] = true;
                }
                if (i == rowSize - 1 || j == colSize - 1) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    atlanticQueue.add(list);
                    hasVisitedA[i][j] = true;
                }
            }
        }

        endWhere(rowSize, colSize, heights, pacificQueue, hasVisitedP);
        endWhere(rowSize, colSize, heights, atlanticQueue, hasVisitedA);
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (hasVisitedA[i][j] && hasVisitedP[i][j]) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;
    }

    public static void endWhere(int rowSize, int colSize, int[][] heights, Queue<List<Integer>> queue, boolean[][] hasVisited) {
        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            int x = list.get(0);
            int y = list.get(1);
            for (int[] direction :
                    dir) {
                int m = x + direction[0];
                int n = y + direction[1];
                if (m < 0 || m >= rowSize || n < 0 || n >= colSize || hasVisited[m][n] || heights[m][n] < heights[x][y]) {
                    continue;
                }
                hasVisited[m][n] = true;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(m);
                l.add(n);
                queue.add(l);
            }
        }
    }
}
