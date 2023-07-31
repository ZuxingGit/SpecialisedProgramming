package topcoder.wk2;

import java.util.Arrays;

public class AveragesOfThree {
    public static void main(String[] args) {
        int[] B1 = {3};
        int[] B2 = {1, 3, 6, 5};
        int[] B3 = {3, 1, 4, 1, 5, 9, 2, 6};
        restore(B1);
        restore(B2);
        restore(B3);
    }

    /**
     * restore the original Array A
     *
     * @param B
     * @return
     */
    public static int[] restore(int[] B) {
        int size = B.length;
        int[] A = new int[size + 2];
        A[0] = 0;
        A[1] = 0;
        for (int i = 0; i < size; i++) {
            A[i + 2] = B[i] * 3 - A[i] - A[i + 1];
        }
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(A));
        return A;
    }
}
