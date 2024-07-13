# https://leetcode.com/problems/two-sum/description/
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums = nums
        size = len(nums)
        for i in range(0,size-1):
            for j in range(i+1, size):
                if nums[i]+nums[j]==target:
                    return [i, j]
        return []
    
nums = [-3,4,3,90]
target = 0
print(Solution().twoSum(nums=nums, target=target))

solution = Solution()
nums = [2,7,11,15]
target = 9
print(solution.twoSum(nums, target))

nums = [3,2,4]
target = 6
print(solution.twoSum(nums, target))

nums = [3,3]
target = 6
print(solution.twoSum(nums, target))