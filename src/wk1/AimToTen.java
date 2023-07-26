package wk1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AimToTen {
    public static void main(String[] args) {
        int[] a1 = {9, 10, 10, 9};
        int[] a2 = {8, 9};
        int[] a3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] a4 = {10, 10, 10, 10};
        need(a1);
        need(a2);
        need(a3);
        need(a4);
    }

    /**
     * how many more 10s you need
     *
     * @param marks
     * @return times of getting 10
     */
    public static int need(int[] marks) {
        int count = 0;
        int sum = IntStream.of(marks).sum();
        int size = marks.length;
        double avg = (double) sum / size;
        int i = 0;
        while (avg < 9.5) {
            i++;
            sum = sum + 10;
            size = size + 1;
            avg = (double) sum / size;
        }
        System.out.println(Arrays.toString(marks));
        System.out.println(i);
        return i;
    }
}
