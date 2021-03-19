# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        return self.isValidBSTUtil(root, None, None)
    
    def isValidBSTUtil(self, root: TreeNode, minVal: int, maxVal: int) -> bool:
        if root == None:
            return True
        
        if minVal != None and root.val <= minVal:
            return False
        if maxVal != None and maxVal <= root.val:
            return False
        
        return self.isValidBSTUtil(root.left, minVal, root.val) and self.isValidBSTUtil(root.right, root.val, maxVal)