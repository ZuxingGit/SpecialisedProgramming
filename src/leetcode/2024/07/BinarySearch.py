# https://leetcode.com/problems/binary-search/

from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        length = len(nums)
        left = 0
        if length == 1:
            if nums[0] == target:
                return 0
            else:
                return -1
        right = length - 1

        while left < right:
            if nums[left] < target and nums[right] > target and (right - left) > 1:
                mid = int((left + right)/2)

                if nums[mid] < target:
                    left = mid
                    continue
                elif nums[mid] > target:
                    right = mid
                    continue
                else:
                    return mid
            elif nums[left] == target:
                return left
            elif nums[right] == target:
                return right
            else:
                return -1
    
sol = Solution()
nums = [-1,0,3,5,9,12]
target = 9
print(sol.search(nums, target))

nums = [-1,0,3,5,9,12]
target = 2
print(sol.search(nums, target))

nums = [5]
target = 5
print(sol.search(nums, target))