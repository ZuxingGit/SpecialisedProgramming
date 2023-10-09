package classContent.wk10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] a2 = {{1, 2}, {1, 2}, {1, 2}};
        int[][] a3 = {{1, 2}, {2, 3}};
        int[][] a4 = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        int[][] a5 = {{0, 2}, {1, 3}, {1, 3}, {2, 4}, {3, 5}, {3, 5}, {4, 6}};
        System.out.println(eraseOverlapIntervals(a1));
        System.out.println(eraseOverlapIntervals(a2));
        System.out.println(eraseOverlapIntervals(a3));
        System.out.println(eraseOverlapIntervals(a4));
        System.out.println(eraseOverlapIntervals(a5));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        if (length == 0)
            return 0;

        Arrays.sort(intervals, new comparator());
        int right = intervals[0][1];
        int count = 1;

        for (int i = 1; i < length; i++) {
            if (intervals[i][0] >= right) {
                right = intervals[i][1];
                count++;
            }
        }
        return length - count;
    }
}

class comparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return a[1] - b[1];
    }
}