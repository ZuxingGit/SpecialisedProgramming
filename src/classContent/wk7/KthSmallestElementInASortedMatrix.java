package classContent.wk7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        /*List<List<Integer>> matrixList = new ArrayList<>();
        int size = matrix.length;
        for (int[] array : matrix
        ) {
            matrixList.add(Arrays.stream(array).boxed().collect(Collectors.toList()));
        }
        int i = 0;
        int min = matrix[0][0];
        while (i < k) {
            int index = 0;
            while (index < size - 1 && matrixList.get(index).size() == 0) {
                index++;
            }
            min = matrixList.get(index).get(0);
            for (int j = 0; j < size; j++) {
                List<Integer> l = matrixList.get(j);
                if (l != null && l.size() > 0) {
                    if (l.get(0) < min) {
                        min = l.get(0);
                        index = j;
                    }
                }
            }
            matrixList.get(index).remove(0);
            i++;
        }
        return min;*/
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
