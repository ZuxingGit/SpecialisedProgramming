# https://leetcode.com/problems/counting-bits/description/
from typing import List

class Solution:
    # def countBits(self, n: int) -> List[int]:
    #     res = [0] * (n + 1)
    #     for i in range(1, n + 1):
    #         count = 0
    #         num = i
    #         while num:
    #             num &= num - 1
    #             count += 1
    #         res[i] = count
    #     return res
    
    def countBits(self, n: int) -> List[int]:
        res = [0] * (n + 1)
        offset = 1

        for i in range(1, n + 1):
            if offset * 2 == i:
                offset = i

            res[i] = res[i - offset] + 1
            
        return res

sol = Solution()
n = 2
print(sol.countBits(n)) # [0,1,1]
    
n = 5
print(sol.countBits(n)) # [0,1,1,2,1,2]