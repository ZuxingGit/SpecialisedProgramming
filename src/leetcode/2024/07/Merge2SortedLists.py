# https://leetcode.com/problems/merge-two-sorted-lists/submissions/
# Definition for singly-linked list.
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        lt = []
        if list1:
            while list1:
                lt.append(list1.val)
                list1 = list1.next
        if list2:
            while list2:
                lt.append(list2.val)
                list2 = list2.next

        lt.sort()
        cur = None
        for val in lt[::-1]:
            cur = ListNode(val, cur)

        return cur
    
sol = Solution()
list1 = ListNode(1, ListNode(2, ListNode(4)))
list2 = ListNode(1, ListNode(3, ListNode(4)))
print(sol.mergeTwoLists(list1, list2))