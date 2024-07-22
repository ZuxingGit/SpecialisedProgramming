# https://leetcode.com/problems/min-cost-climbing-stairs/description/
from typing import List

class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        a, b = cost[0], cost[1]
        for i in range(2, len(cost)):
            a, b = b, min(a, b) + cost[i]
        return min(a, b)
    
sol = Solution()
print(sol.minCostClimbingStairs([10, 15, 20])) # 15
print(sol.minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 100, 1])) # 6