# https://leetcode.com/problems/trapping-rain-water/description/
from typing import List

class Solution:
    def trap(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        left_max = 0
        right_max = 0
        result = 0
        while left < right:
            if height[left] < height[right]:
                if height[left] >= left_max:
                    left_max = height[left]
                else:
                    result += left_max - height[left]
                left += 1
            else:
                if height[right] >= right_max:
                    right_max = height[right]
                else:
                    result += right_max - height[right]
                right -= 1
        return result
    
sol = Solution()
height = [0,1,0,2,1,0,1,3,2,1,2,1]
print(sol.trap(height))

height = [4,2,0,3,2,5]
print(sol.trap(height))