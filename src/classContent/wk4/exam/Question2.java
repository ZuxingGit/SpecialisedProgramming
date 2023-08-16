package classContent.wk4.exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] row0 = {3}, col0 = {5};
        int add0 = 1;
        int[] row1 = {0}, col1 = {1};
        int add1 = 1;
        int[] row2 = {0}, col2 = {1};
        int add2 = 3;
        int[] row3 = {14, 19}, col3 = {3, 47};
        int add3 = 0;
        int[] row4 = {}, col4 = {};
        int add4 = 2;
        int[] row5 = {1, 2, 3}, col5 = {7, 2, 19};
        int add5 = 1;
        int[] row6 = {}, col6 = {};
        int add6 = 16;
        int[] row7 = {}, col7 = {};
        int add7 = 0;
        int[] row8 = {4, 35, 36, 16, 24, 39, 1, 34, 32, 28, 2, 23}, col8 = {27, 29, 21, 32, 25, 2, 6, 0, 22, 15, 35, 45};
        int add8 = 4;
        int[] row9 = {38, 35, 48, 15, 2, 21, 24, 34, 6, 14, 30, 26}, col9 = {21, 36, 12, 46, 8, 6, 32, 16, 41, 44, 47, 38};
        int add9 = 4;
        int[] row10 = {43, 49, 35, 22, 30, 36, 46, 14, 7, 13, 38, 0}, col10 = {18, 15, 16, 34, 19, 49, 33, 38, 40, 24, 35, 10};
        int add10 = 4;
        int[] row11 = {4, 32, 34}, col11 = {17, 39, 30};
        int add11 = 13;
        int[] row12 = {23, 2, 43, 45, 20, 36, 13, 11, 30, 8, 33, 6, 28, 41}, col12 = {48, 38, 30, 40, 1, 15, 22, 11, 12, 6, 25, 17, 0, 7};
        int add12 = 2;
        int[] row13 = {4, 1, 2, 11, 32, 12, 31, 29, 36, 44, 34, 40, 39, 24}, col13 = {23, 16, 8, 47, 31, 49, 33, 36, 0, 4, 21, 2, 15, 7};
        int add13 = 2;
        System.out.println("test case0:" + Arrays.toString(addAttackers(row0, col0, add0)));
        System.out.println("test case1:" + Arrays.toString(addAttackers(row1, col1, add1)));
        System.out.println("test case2:" + Arrays.toString(addAttackers(row2, col2, add2)));
        System.out.println("test case3:" + Arrays.toString(addAttackers(row3, col3, add3)));
        System.out.println("test case4:" + Arrays.toString(addAttackers(row4, col4, add4)));
        System.out.println("test case5:" + Arrays.toString(addAttackers(row5, col5, add5)));
        System.out.println("test case6:" + Arrays.toString(addAttackers(row6, col6, add6)));
        System.out.println("test case7:" + Arrays.toString(addAttackers(row7, col7, add7)));
        System.out.println("test case8:" + Arrays.toString(addAttackers(row8, col8, add8)));
        System.out.println("test case9:" + Arrays.toString(addAttackers(row9, col9, add9)));
        System.out.println("test case10:" + Arrays.toString(addAttackers(row10, col10, add10)));
        System.out.println("test case11:" + Arrays.toString(addAttackers(row11, col11, add11)));
        System.out.println("test case12:" + Arrays.toString(addAttackers(row12, col12, add12)));
        System.out.println("test case13:" + Arrays.toString(addAttackers(row13, col13, add13)));
    }

    public static int[] addAttackers(int[] row, int[] col, int add) {
        ArrayList<Integer> resList = new ArrayList<>();
        int[] res;
        int rangeSize = 50;
        if (add == 0)
            return new int[0];
        int rowSize = row.length;
        int colSize = col.length;
        if (rowSize != colSize || rowSize > 16 || colSize > 16 || add > 16)
            System.err.println("Wrong input");
        //coordination of the current point/index (x,y)
        int x;
        int y;
        for (x = 0; x < rangeSize; x++) {
            for (y = 0; y < rangeSize; y++) {
                if (rowSize == 0) {
                    if (resList.size() == 0) {
                        resList.add(x);
                        resList.add(y);
                    } else {
                        if (isLineal(x, y, resList))
                            continue;
                        resList.add(x);
                        resList.add(y);
                    }
                }
                for (int i = 0; i < rowSize; i++) {
                    //shouldn't be lineal with existed old points
                    if (isLineal(x, y, row[i], col[i]))
                        break;
                    else if (i == rowSize - 1) {
                        //shouldn't be lineal with new-added points
                        if (resList.size() > 0 && isLineal(x, y, resList))
                            break;
                        resList.add(x);
                        resList.add(y);
                    }
                }
                if (resList.size() >= 2 * add) {
                    res = resList.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
                    return res;
                }
            }
        }
        return new int[0];
    }

    /**
     * whether this point is lineal with new added points which is stored in a temporary list
     *
     * @param x
     * @param y
     * @param list
     * @return
     */
    public static boolean isLineal(int x, int y, ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i <= size - 2; i = i + 2) {
            if (isLineal(x, y, list.get(i), list.get(i + 1)))
                return true;
        }

        return false;
    }

    /**
     * whether two coordinates are in the same line
     *
     * @param x
     * @param y
     * @param row
     * @param col
     * @return
     */
    public static boolean isLineal(int x, int y, int row, int col) {
        if (x == row || y == col)
            return true;

        int distanceX = x - row;
        int distanceY = y - col;
        if (Math.abs(distanceX) == Math.abs(distanceY))
            return true;

        return false;
    }
}
