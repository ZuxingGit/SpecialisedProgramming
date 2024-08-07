# https://leetcode.com/problems/daily-temperatures/description/
from typing import List

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0] * len(temperatures) # the last temperature will always be 0
        stack = []
        for i in range(len(temperatures)):
            while stack and temperatures[i] > temperatures[stack[-1]]:
                # pop the index of the temperature that is less than the current temperature
                # find the cloest temperature that is greater than the current temperature
                idx = stack.pop()
                # the difference between the current index 
                # and the index of the temperature that is greater than the current temperature
                result[idx] = i - idx
            stack.append(i)
        return result
    
sol = Solution()
temperatures = [73,74,75,71,69,72,76,73]
print(sol.dailyTemperatures(temperatures)) # [1,1,4,2,1,1,0,0]

temperatures = [30,40,50,60]
print(sol.dailyTemperatures(temperatures)) # [1,1,1,0]

temperatures = [30,60,90]
print(sol.dailyTemperatures(temperatures)) # [1,1,0]