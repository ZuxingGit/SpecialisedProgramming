# https://leetcode.com/problems/climbing-stairs/description/

class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        a, b = 1, 2
        for _ in range(n - 2):
            a, b = b, a + b
        return b
    

sol = Solution()
print(sol.climbStairs(2)) # 2

print(sol.climbStairs(3)) # 3
print(sol.climbStairs(4)) # 5