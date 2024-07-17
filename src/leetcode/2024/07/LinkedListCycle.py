# https://leetcode.com/problems/linked-list-cycle/description/
from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if not head:
            return False
        slow = head
        fast = head.next
        while slow != fast:
            # if fast is None or fast.next is None, then there is no cycle
            # otherwise, slow and fast will meet at some point
            if not fast or not fast.next:
                # no cycle, reach the end of the list
                return False
            slow = slow.next
            # fast moves 2 steps at a time
            fast = fast.next.next
        return True
    
sol = Solution()
head = ListNode(3)
head.next = ListNode(2)
head.next.next = ListNode(0)
head.next.next.next = ListNode(-4)
head.next.next.next.next = head.next
print(sol.hasCycle(head)) # True

head = ListNode(1)
head.next = ListNode(2)
head.next.next = head
print(sol.hasCycle(head)) # True

head = ListNode(1)
print(sol.hasCycle(head)) # False

head = None
print(sol.hasCycle(head)) # False