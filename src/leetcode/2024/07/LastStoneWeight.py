# https://leetcode.com/problems/last-stone-weight/description/
from typing import List

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()
        while len(stones) > 1:
            y = stones.pop()
            x = stones.pop()
            if x != y:
                stones.append(y - x)
                stones.sort()
        return stones[0] if stones else 0
    
sol = Solution()
print(sol.lastStoneWeight([2,7,4,1,8,1])) # 1

print(sol.lastStoneWeight([1])) # 1
print(sol.lastStoneWeight([2,2])) # 0