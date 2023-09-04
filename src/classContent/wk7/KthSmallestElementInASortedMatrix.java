package classContent.wk7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int[][] matrix2 = {{-5}};
//        int[] a=new int[3];
//        System.out.println(Arrays.toString(a));
        System.out.println(kthSmallest(matrix1, 8));
        System.out.println(kthSmallest(matrix2, 1));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int size = matrix.length;
        List<Integer> oneArrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int[] a = matrix[i];
            for (int e : a
            ) {
                oneArrayList.add(e);
            }
        }
        Collections.sort(oneArrayList);
        return oneArrayList.get(k - 1);
    }
}
