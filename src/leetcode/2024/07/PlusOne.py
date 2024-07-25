# https://leetcode.com/problems/plus-one/description/
from typing import List

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        str_digits = ''
        for digit in digits:
            str_digits += str(digit)
        number = int(str_digits)
        return [int(digit) for digit in str(number + 1)]
    
sol = Solution()
digits = [1,2,3]
print(sol.plusOne(digits))

digits = [4,3,2,1]
print(sol.plusOne(digits))

digits = [0]
print(sol.plusOne(digits))

digits = [9]
print(sol.plusOne(digits))