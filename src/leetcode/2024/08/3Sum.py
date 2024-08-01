# https://leetcode.com/problems/3sum/description/
from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                elif sum < 0:
                    left += 1
                else:
                    right -= 1
        return res
    
sol = Solution()
nums = [-1,0,1,2,-1,-4]
print(sol.threeSum(nums)) # [[-1,-1,2],[-1,0,1]]

nums = [0,1,1]
print(sol.threeSum(nums)) # []

nums = [0,0,0]
print(sol.threeSum(nums)) # [[0,0,0]]