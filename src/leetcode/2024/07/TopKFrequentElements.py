# https://leetcode.com/problems/top-k-frequent-elements/description/
from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        summary = {}
        for num in nums:
            if num in summary:
                summary[num] += 1
            else:
                summary[num] = 1
        
        keys = list(summary.keys())
        vals = list(summary.values())
        res = []
        for _ in range(0, k):
            max_val = max(vals)
            index = vals.index(max_val)
            # print(f"max: {max_val}")
            # print(f"Index: {index}")
            vals.remove(max_val)
            res.append(keys.pop(index))

        return res

sol = Solution()
nums = [1,1,1,2,2,3]
k = 2
print(sol.topKFrequent(nums, k))

nums = [1]
k = 1
print(sol.topKFrequent(nums, k))