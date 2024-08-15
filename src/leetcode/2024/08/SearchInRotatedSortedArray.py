# Search in Rotated Sorted Array
# https://leetcode.com/problems/search-in-rotated-sorted-array/description/
from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target:
                return mid
            if nums[mid] >= nums[left]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1
    
sol = Solution()
nums = [4,5,6,7,0,1,2]
target = 0
print(sol.search(nums, target)) # 4

nums = [4,5,6,7,0,1,2]
target = 3
print(sol.search(nums, target)) # -1

nums = [1]
target = 0
print(sol.search(nums, target)) # -1