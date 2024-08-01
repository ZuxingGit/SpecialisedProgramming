# https://leetcode.com/problems/container-with-most-water/description/
from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        size = len(height)
        left = 0
        right = size - 1
        max_area = 0
        while left < right:
            area = min(height[left], height[right]) * (right - left)
            max_area = max(max_area, area)
            if height[left] > height[right]:
                right -= 1
            else:
                left += 1
        return max_area
    
sol = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(sol.maxArea(height))

height = [1,1]
print(sol.maxArea(height))