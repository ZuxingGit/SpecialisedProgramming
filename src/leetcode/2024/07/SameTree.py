# https://leetcode.com/problems/same-tree/description/
from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        if p.val != q.val:
            return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
    
sol = Solution()
p = TreeNode(1)
p.left = TreeNode(2)
p.right = TreeNode(3)
q = TreeNode(1)
q.left = TreeNode(2)
q.right = TreeNode(3)
print(sol.isSameTree(p, q)) # True

p = TreeNode(1)
p.left = TreeNode(2)
q = TreeNode(1)
q.right = TreeNode(2)
print(sol.isSameTree(p, q)) # False

p = TreeNode(1)
p.left = TreeNode(2)
p.right = TreeNode(1)
q = TreeNode(1)
q.left = TreeNode(1)
q.right = TreeNode(2)
print(sol.isSameTree(p, q)) # False