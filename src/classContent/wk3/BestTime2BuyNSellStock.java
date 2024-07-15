package classContent.wk3;


public class BestTime2BuyNSellStock {
    public static void main(String[] args) {
        int[] p1 = {7, 1, 5, 3, 6, 4};
        int[] p2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(p1));
        System.out.println(maxProfit(p2));
    }

    public static int maxProfit(int[] prices) {
        int size = prices.length;
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < size; i++) {
            if (prices[i] < min)
                min = prices[i];
            else
                maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}
