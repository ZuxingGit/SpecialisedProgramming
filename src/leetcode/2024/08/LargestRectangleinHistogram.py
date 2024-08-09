# https://leetcode.com/problems/largest-rectangle-in-histogram/description/
from typing import List

class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        res = 0
        stack = []
        heights.append(0)
        for i, h in enumerate(heights):
            # if the current height is less than the height of the last bar in the stack
            # then the last bar in the stack cannot be extended to the right
            while stack and h < heights[stack[-1]]:
                # the height of the last bar in the stack
                height = heights[stack.pop()]
                # the width of the last bar in the stack
                # if the stack is empty, then the width is i
                # otherwise, the width is i - stack[-1] - 1
                width = i if not stack else i - stack[-1] - 1
                # the area of the last bar in the stack
                res = max(res, height * width)
            stack.append(i)
        return res
    
sol = Solution()
heights = [2,1,5,6,2,3]
print(sol.largestRectangleArea(heights)) # 10

heights = [2,4]
print(sol.largestRectangleArea(heights)) # 4