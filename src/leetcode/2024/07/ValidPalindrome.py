# https://leetcode.com/problems/valid-palindrome/description/
class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s.isspace():
            return True
        
        if not s.islower():
            s = s.lower()
        # print(s)
        # Remove non-alphanumeric characters
        s1 = ''.join(c for c in s if c.isalnum())
        # reverse
        s2 = s1[::-1]
        return s1 == s2
    
sol =  Solution()
str = "A man, a plan, a canal: Panama"
print(sol.isPalindrome(str))

str = "race a car"
print(sol.isPalindrome(str))

str = "     "
print(sol.isPalindrome(str))