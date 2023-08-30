package classContent.wk6;

import java.util.ArrayList;
import java.util.Arrays;

public class BagsOfCandies {
    public static void main(String[] args) {
        int[] a1 = {7, 2};
        int[] a2 = {2, 7, 3};
        int[] a3 = {1000, 1000, 1000, 1000, 1000};
        int[] a4 = {823, 912, 345, 100000, 867, 222, 991, 3, 40000};
        int[] a5 = {3, 9, 1, 2};
        System.out.println(getGain(a1));
        System.out.println(getGain(a2));
        System.out.println(getGain(a3));
        System.out.println(getGain(a4));
        System.out.println(getGain(a5));

    }

    public static int getGain(int[] bags) {

        return getMaxGain(true, 0, bags.length - 1, bags);
    }

    public static int getMaxGain(boolean myTurn, int left, int right, int[] bags) {
        if (left == right)
            return myTurn ? bags[left] : -bags[left];

        if (myTurn) {
            return Math.max(getMaxGain(false, left + 1, right, bags)+bags[left], 
                    getMaxGain(false, left, right - 1, bags)+bags[right]);
        } else {
            return Math.min(getMaxGain(true, left + 1, right, bags)-bags[left], 
                    getMaxGain(true, left, right - 1, bags)-bags[right]);
        }
    }
}
