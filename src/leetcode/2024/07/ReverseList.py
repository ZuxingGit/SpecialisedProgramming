# https://leetcode.com/problems/reverse-linked-list/description/
from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        List = []
        if not head:
            return head
        
        while head:
            List.append(head.val)
            head = head.next
        # List = List[::-1]
        cur = None
        for val in List:
            cur = ListNode(val, cur)

        return cur
    
sol = Solution()
head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
print(sol.reverseList(head))