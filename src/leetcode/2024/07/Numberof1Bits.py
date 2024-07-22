# https://leetcode.com/problems/number-of-1-bits/description/
class Solution:
    def hammingWeight(self, n: int) -> int:
        res = 0
        while n:
            n &= n - 1
            res += 1
        # while n:
        #     res += n & 1
        #     n >>= 1
        return res
    
sol = Solution()
n = 11
print(sol.hammingWeight(n)) # 3

n = 128
print(sol.hammingWeight(n)) # 1

n = 2147483645
print(sol.hammingWeight(n)) # 30

n = 5
print(sol.hammingWeight(n)) # 1