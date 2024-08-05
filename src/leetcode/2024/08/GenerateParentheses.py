# https://leetcode.com/problems/generate-parentheses/description/
from typing import List

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        left = right = n
        result = []
        def backtrack(s, left, right):
            # end condition
            if len(s) == 2 * n:
                result.append(s)
                return
            # branch 1: add ( if there are any left
            if left:
                backtrack(s + "(", left - 1, right)
            # branch 2: add ) if there are more right parenthesis than left
            if right > left:
                backtrack(s + ")", left, right - 1)
        backtrack("", left, right)
        return result
    
sol = Solution()
n = 3
print(sol.generateParenthesis(n)) # ["((()))","(()())","(())()","()(())","()()()"]

n = 1
print(sol.generateParenthesis(n)) # ["()"]