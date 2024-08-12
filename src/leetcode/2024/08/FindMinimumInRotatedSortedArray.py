# Find Minimum in Rotated Sorted Array
# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
from typing import List

class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        while left < right:
            mid = (left + right) // 2
            if nums[mid] < nums[right]:
                right = mid
            else:
                left = mid + 1
        return nums[left]
    
sol = Solution()
nums = [3,4,5,1,2]
print(sol.findMin(nums)) # 1

nums = [4,5,6,7,0,1,2]
print(sol.findMin(nums)) # 0

nums = [11,13,15,17]
print(sol.findMin(nums)) # 11