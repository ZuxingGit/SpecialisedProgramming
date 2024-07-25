# https://leetcode.com/problems/happy-number/description/
class Solution:
    def isHappy(self, n: int) -> bool:
        history = []
        s = 0
        while n != 1:
            s = sum([int(digit)**2 for digit in str(n)])
            if s not in history:
                history.append(s)
                n = s
            else:
                return False
            
        return True
    
sol = Solution()
n = 19
print(sol.isHappy(n))

n = 2
print(sol.isHappy(n))