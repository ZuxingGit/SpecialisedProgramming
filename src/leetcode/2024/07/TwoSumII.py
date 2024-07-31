# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
from typing import List

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1
        while left < right:
            sum = numbers[left] + numbers[right]
            if sum == target:
                return [left + 1, right + 1]
            elif sum < target:
                left += 1
            else:
                right -= 1
        return []
    
sol = Solution()
numbers = [2,7,11,15]
target = 9
print(sol.twoSum(numbers, target))

numbers = [2,3,4]
target = 6
print(sol.twoSum(numbers, target))

numbers = [-1,0]
target = -1
print(sol.twoSum(numbers, target))