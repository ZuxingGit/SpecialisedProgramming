# https://leetcode.com/problems/balanced-binary-tree/description/
from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        self.ans = True
        def depth(node):
            if not node:
                return 0
            left = depth(node.left)
            right = depth(node.right)
            if abs(left - right) > 1:
                self.ans = False
            return 1 + max(left, right)
        depth(root)
        return self.ans
    
sol = Solution()
root = TreeNode(3)
root.left = TreeNode(9)
root.right = TreeNode(20)
root.right.left = TreeNode(15)
root.right.right = TreeNode(7)
print(sol.isBalanced(root)) # True

root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(2)
root.left.left = TreeNode(3)
root.left.right = TreeNode(3)
root.left.left.left = TreeNode(4)
root.left.left.right = TreeNode(4)
print(sol.isBalanced(root)) # False

root = TreeNode()
print(sol.isBalanced(root)) # True