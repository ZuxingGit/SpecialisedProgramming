package classContent.wk6;

import java.util.Arrays;
import java.util.HashMap;

public class StoneGame {
    public static void main(String[] args) {
        int[] a6 = {7, 7, 12, 16, 41, 48, 41, 48, 11, 9, 34, 2, 44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34, 48, 27, 16, 24, 22, 48, 50, 10, 26, 27, 9, 43, 13, 42, 46, 24};
        System.out.println(stoneGame(a6));
    }

    public static boolean stoneGame(int[] piles) {
        if (piles.length == 1) {
            System.err.println("Wrong number of piles");
            return true;
        }

        if (piles.length == 2)
            return true;

        int sum = Arrays.stream(piles).sum();
        HashMap hashMap = new HashMap<>();
        int finalNum = getFinalNumber(true, 0, piles.length - 1, piles, hashMap);
        if (2 * finalNum > sum)
            return true;

        return false;
    }

    public static int getFinalNumber(boolean myTurn, int left, int right, int[] piles, HashMap hashMap) {
        if (left == right)
            return myTurn ? piles[left] : 0;

        int result = 0;
        String key = myTurn + ":" + left + "-" + right;
        if (hashMap.containsKey(key))
            return (int) hashMap.get(key);

        if (myTurn) {
            result = Math.max(getFinalNumber(false, left + 1, right, piles, hashMap) + piles[left],
                    getFinalNumber(false, left, right - 1, piles, hashMap) + piles[right]);
        } else {
            result = Math.max(getFinalNumber(true, left + 1, right, piles, hashMap),
                    getFinalNumber(true, left, right - 1, piles, hashMap));
        }
        hashMap.put(key, result);
        return result;
    }
}
