class Solution(object):
    def numEquivDominoPairs(self, dominoes):
        """
        :type dominoes: List[List[int]]
        :rtype: int
        """
        count = {}
        for a, b in dominoes:
            key = (min(a, b), max(a, b))
            count[key] = count.get(key, 0) + 1

        result = 0
        for c in count.values():
            result += c * (c - 1) // 2

        return result
    
# Test case
solution = Solution()
# Example test case
dominoes1 = [[1, 2], [2, 1], [3, 4], [5, 6]]
result1 = solution.numEquivDominoPairs(dominoes1)
print(result1)  # Output: 1

dominoes2 = [[1, 2], [1, 2], [1, 1], [1, 2], [2, 2]]
result2 = solution.numEquivDominoPairs(dominoes2)
print(result2)  # Output: 3