# Koko Eating bananas
# https://leetcode.com/problems/koko-eating-bananas/description/
from typing import List

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)
        while left < right:
            mid = (left + right) // 2
            # if total hours taken to eat all the bananas with mid speed is greater than h
            # then we need to increase the speed
            if sum((pile + mid - 1) // mid for pile in piles) > h:
                left = mid + 1
            # else we try decreasing the speed
            else:
                right = mid
        return left

sol = Solution()
piles = [3,6,7,11]
h = 8
print(sol.minEatingSpeed(piles, h)) # 4

piles = [30,11,23,4,20]
h = 5
print(sol.minEatingSpeed(piles, h)) # 30

piles = [30,11,23,4,20]
h = 6
print(sol.minEatingSpeed(piles, h)) # 23