# https://leetcode.com/problems/diameter-of-binary-tree/description/
from typing import Optional

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.ans = 0
        def depth(node):
            if not node:
                return 0
            left = depth(node.left)
            right = depth(node.right)
            self.ans = max(self.ans, left + right)
            return 1 + max(left, right)
        depth(root)
        return self.ans
    
sol = Solution()
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
print(sol.diameterOfBinaryTree(root)) # 3

root = TreeNode(1)
print(sol.diameterOfBinaryTree(root)) # 0
root.left = TreeNode(2)
print(sol.diameterOfBinaryTree(root)) # 1