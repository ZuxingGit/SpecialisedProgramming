class Solution(object):
    def distributeCandies(self, candies, num_people):
        """
        :type candies: int
        :type num_people: int
        :rtype: List[int]
        """
        res = [0] * num_people
        i = 0
        while candies > 0:
            res[i % num_people] += min(candies, i + 1)
            candies -= min(candies, i + 1)
            i += 1
        return res
    
# Test case
solution = Solution()
# Example test case
candies = 7
num_people = 4
result = solution.distributeCandies(candies, num_people)
print(result)  # Output: [1, 2, 3, 1]

candies = 10
num_people = 3
result = solution.distributeCandies(candies, num_people)
print(result)  # Output: [5, 2, 3]