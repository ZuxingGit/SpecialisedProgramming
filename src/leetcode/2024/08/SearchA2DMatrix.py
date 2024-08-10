# Search a 2D Matrix
# https://leetcode.com/problems/search-a-2d-matrix/description/
from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left = 0
        right = len(matrix) * len(matrix[0]) - 1
        while left <= right:
            mid = (left + right) // 2
            row = mid // len(matrix[0])
            col = mid % len(matrix[0])
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                left = mid + 1
            else:
                right = mid - 1
        return False
    
sol = Solution()
matrix = [
    [1,3,5,7],
    [10,11,16,20],
    [23,30,34,60]
]
target = 3
print(sol.searchMatrix(matrix, target)) # True

target = 13
print(sol.searchMatrix(matrix, target)) # False