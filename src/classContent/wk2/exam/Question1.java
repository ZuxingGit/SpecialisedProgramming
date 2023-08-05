package classContent.wk2.exam;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(determineBallColor(1, 1, 1, 3));
        System.out.println(determineBallColor(3, 4, 5, 4));
        System.out.println(determineBallColor(7, 7, 1, 7));
        System.out.println(determineBallColor(1000000000000L, 1, 1, 1000000000002L));
        System.out.println(determineBallColor(653, 32, 1230, 556));
        System.out.println(determineBallColor(39, 4, 29, 7));
        System.out.println(determineBallColor(271281576404L, 789227539981L, 962212822048L, 1863718050608L));
    }

    public static String determineBallColor(long r, long g, long b, long k) {
        if ((r < 1) || (r > 1000000000000L) || (g < 1) || (g > 1000000000000L)
                || (b < 1) || (b > 1000000000000L) || k > (r + g + b) || k < 0) {
            return "invalid parameter! no output!";
        }
        final String red = "RED";
        final String green = "GREEN";
        final String blue = "BLUE";
        // the process of destroy
        Long[] LArr = new Long[]{r, g, b};
        Arrays.sort(LArr);
        Long min = LArr[0];
        Long mid = LArr[1];
        Long max = LArr[2];
        if (0 < k && k <= 3 * min) {
            Long t = k % 3;
            if (t == 1) {
                return red;
            } else if (t == 2) {
                return green;
            } else
                return blue;
        } else if (3 * min < k && k <= 2 * mid + min) {
            Long t = (k - min) % 2;
            if (t == 1) {
                if (r == min) {
                    return green;
                } else {
                    return red;
                }
            } else {
                if (b == min) {
                    return green;
                } else
                    return blue;
            }
        } else {
            if (b==max){
                return blue;
            } else if (g==max) {
                return green;
            } else 
                return red;
        }
    }
}
