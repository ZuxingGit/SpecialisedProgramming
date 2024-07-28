# https://leetcode.com/problems/valid-sudoku/description/
from typing import List

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # get all numbers in a row
        for row in board:
            if not self.isValid(row):
                return False
        # get all numbers in a column
        for col in zip(*board):
            if not self.isValid(col):
                return False
        # get all numbers in a 3x3 box
        for i in range(3):
            for j in range(3):
                box = [board[x][y] for x in range(3*i, 3*i+3) for y in range(3*j, 3*j+3)]
                if not self.isValid(box):
                    return False
        return True
    
    def isValid(self, nums):
        num_set = set()
        for num in nums:
            if num == '.':
                continue
            if num in num_set:
                return False
            num_set.add(num)
        return True
    
sol = Solution()
board = [["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
print(sol.isValidSudoku(board)) # True

board = [["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
print(sol.isValidSudoku(board)) # False