# https://leetcode.com/problems/kth-largest-element-in-a-stream/
from typing import List

class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        nums.sort()
        self.nums = nums[-k:]

    def add(self, val: int) -> int:
        if len(self.nums) < self.k:
            self.nums.append(val)
            self.nums.sort()
        else:
            if val > self.nums[0]:
                self.nums[0] = val
                self.nums.sort()
        return self.nums[0]


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
k = 3
nums = [4,5,8,2]
obj = KthLargest(k, nums)
print(obj.add(3)) # 4
print(obj.add(5)) # 5
print(obj.add(10)) # 5
print(obj.add(9)) # 8
print(obj.add(4)) # 8