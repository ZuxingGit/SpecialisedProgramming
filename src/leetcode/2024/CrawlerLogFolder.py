# https://leetcode.com/problems/crawler-log-folder/?envType=daily-question&envId=2024-07-10
from typing import List
class Solution:
    def minOperations(self, logs: List[str]) -> int:
        res = 0
        for log in logs:
            if log == '../':
                res = max(0, res - 1)
            elif log != './':
                res += 1
        print(res)
        return res
    
Solution().minOperations(["d1/","d2/","../","d21/","./"])