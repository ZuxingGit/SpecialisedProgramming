package classContent.wk7;

import java.util.HashMap;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        int[] coins2 = {2};
        int amount2 = 3;
        int[] coins3 = {1};
        int amount3 = 0;
        int[] coins4 = {186, 419, 83, 408};
        int amount4 = 6249;
        int[] coins5 = {1, 2};
        int amount5 = 5;
//        System.out.println(coinChange(coins1, amount1));
//        System.out.println(coinChange(coins2, amount2));
//        System.out.println(coinChange(coins3, amount3));
        System.out.println(coinChange(coins4, amount4));
        System.out.println(coinChange(coins5, amount5));
    }

    public static int coinChange(int[] coins, int amount) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        return dp(coins, amount, hashMap);
    }

    public static int dp(int[] coins, int amount, HashMap<Integer, Integer> hashMap) {
        if (amount < 0)
            return -1;

        if (amount == 0)
            return 0;

        if (hashMap.containsKey(amount)) {
            if (hashMap.get(amount) > -1)
                return hashMap.get(amount);
            else
                return -1;
        }

//        int size = coins.length;
        int count = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount >= coin) {
                int tmp = dp(coins, amount - coin, hashMap);
                if (tmp > -1)
                    count = Math.min(1 + dp(coins, amount - coin, hashMap), count);
            }
        }
        if (count != Integer.MAX_VALUE) {
            hashMap.put(amount, count);
            return count;
        } else {
            hashMap.put(amount, -1);
            return -1;
        }
    }
}
