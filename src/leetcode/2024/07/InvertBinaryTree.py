# https://leetcode.com/problems/invert-binary-tree/
from typing import Optional
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        
        # invert left and right subtrees
        root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
        return root
    
    def printTree(self, root: Optional[TreeNode]) -> None:
        if not root:
            return
        print(root.val)
        self.printTree(root.left)
        self.printTree(root.right)

sol = Solution()
root = TreeNode(4)
root.left = TreeNode(2)
root.right = TreeNode(7)
root.left.left = TreeNode(1)
root.left.right = TreeNode(3)
root.right.left = TreeNode(6)
root.right.right = TreeNode(9)
# sol.printTree(root)
sol.invertTree(root)
sol.printTree(root)

root = TreeNode(2)
root.left = TreeNode(1)
root.right = TreeNode(3)
# sol.printTree(root)
sol.invertTree(root)
sol.printTree(root)