# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        length = len(prices)
        if length == 1:
            return 0
        max_profit = 0
        min_price = prices[0]
        for i in range(1, length):
            if prices[i] < min_price:
                min_price = prices[i]
            else:
                max_profit = max(max_profit, prices[i] - min_price)
        return max_profit
    
sol = Solution()
prices = [7,1,5,3,6,4]
print(sol.maxProfit(prices))

prices = [7,6,4,3,1]
print(sol.maxProfit(prices))