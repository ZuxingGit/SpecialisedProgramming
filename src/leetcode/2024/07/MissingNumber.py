# https://leetcode.com/problems/missing-number/description/
from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums = sorted(nums)
        size = len(nums)
        for i in range(0, size):
            if i != nums[i]:
                return i
        return size
            
            
sol = Solution()
nums = [3, 0, 1]
print(sol.missingNumber(nums))

nums = [0, 1]
print(sol.missingNumber(nums))

nums = [9,6,4,2,3,5,7,0,1]
print(sol.missingNumber(nums))