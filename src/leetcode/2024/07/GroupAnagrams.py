# https://leetcode.com/problems/group-anagrams/description/
from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = defaultdict(list)
        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)

        return list(anagram_map.values())

sol = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(sol.groupAnagrams(strs))

strs = [""]
print(sol.groupAnagrams(strs))

strs = ["a"]
print(sol.groupAnagrams(strs))

strs = ["","",""]
print(sol.groupAnagrams(strs))