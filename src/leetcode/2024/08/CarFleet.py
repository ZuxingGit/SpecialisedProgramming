# https://leetcode.com/problems/car-fleet/description/
from typing import List

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = sorted(zip(position, speed))
        time = [(target - pos) / spd for pos, spd in cars]
        res = 0
        while len(time) > 1:
            lead = time.pop()
            # if the lead car arrives earlier than the car after it
            # then the car after it will not be able to catch up
            # the lead car is a single-car fleet
            if lead < time[-1]:
                res += 1
            # if the lead car arrives later than the car after it
            # then the car after it will be able to catch up
            # they will form a fleet
            else:
                time[-1] = lead
                # the slowest speed is bottleneck
        return res + 1
    
sol = Solution()
target = 12
position = [10,8,0,5,3]
speed = [2,4,1,1,3]
print(sol.carFleet(target, position, speed)) # 3

target = 10
position = [3]
speed = [3]
print(sol.carFleet(target, position, speed)) # 1

target = 100
position = [0,2,4]
speed = [4,2,1]
print(sol.carFleet(target, position, speed)) # 1
