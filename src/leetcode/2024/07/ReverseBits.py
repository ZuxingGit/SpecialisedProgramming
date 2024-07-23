# https://leetcode.com/problems/reverse-bits/

class Solution:
    # def reverseBits(self, n: int) -> int:
    #     res = 0
    #     for i in range(32):
    #         res <<= 1
    #         res |= n & 1
    #         n >>= 1
    #     return res
    
    def reverseBits(self, n: int) -> int:
        res = 0
        count = 32
        while n:
            bit = n & 1
            res <<= 1
            res |= bit
            count -= 1
            n >>= 1
        if count > 0:
            res <<= count
        return res
    
sol = Solution()
n = 13
print(sol.reverseBits(n)) # 2952790016

n = 43261596
print(sol.reverseBits(n)) # 964176192

n = 4294967293
print(sol.reverseBits(n)) # 3221225471
