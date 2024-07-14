# https://leetcode.com/problems/valid-parentheses/description/
class Solution:
    def isValid(self, s: str) -> bool:
        list = []
        dict = {"(":")","{":"}","[":"]"}
        left_p = dict.keys()
        for c in s:
            if c in ["(",")","{","}","[","]"]:
                if c in left_p:
                    list.append(c)
                else:
                    if len(list) > 0:
                        if dict[list[-1]] == c:
                            list.pop(-1)
                        else:
                            return False
                    else:
                        return False
            # print(list)
        return len(list) == 0
    
sol = Solution()
str = "()"
print(sol.isValid(str))

str = "()[]{}"
print(sol.isValid(str))

str = "(]"
print(sol.isValid(str))

str = "(])"
print(sol.isValid(str))

str = "]"
print(sol.isValid(str))