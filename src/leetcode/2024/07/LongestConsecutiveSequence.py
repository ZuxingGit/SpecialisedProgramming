# https://leetcode.com/problems/longest-consecutive-sequence/description/
from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        nums = set(nums)
        max_length = 0
        for num in nums:
            if num - 1 not in nums:
                length = 1
                while num + 1 in nums:
                    num += 1
                    length += 1
                max_length = max(max_length, length)
        return max_length
    
sol = Solution()
nums = [100,4,200,1,3,2]
print(sol.longestConsecutive(nums))

nums = [0,3,7,2,5,8,4,6,0,1]
print(sol.longestConsecutive(nums))