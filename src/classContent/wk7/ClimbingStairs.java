package classContent.wk7;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(0));
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));

    }

    public static int climbStairs(int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        return dp(n, hashMap);
    }

    public static int dp(int n, HashMap<Integer, Integer> hashMap) {
        if (hashMap.containsKey(n))
            return hashMap.get(n);

        if (n < 1 || n > 45) {
            System.err.print("Wrong parameter! return:");
            return -1;
        }

        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        int result = dp(n - 1, hashMap) + dp(n - 2, hashMap);
        hashMap.put(n, result);
        return result;
    }
}
