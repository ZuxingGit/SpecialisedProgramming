# https://leetcode.com/problems/single-number/description/
from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res ^= num
        return res
    
sol = Solution()
nums = [2, 2, 1]
print(sol.singleNumber(nums)) # 1

nums = [4, 1, 2, 1, 2]
print(sol.singleNumber(nums)) # 4

nums = [1]
print(sol.singleNumber(nums)) # 1