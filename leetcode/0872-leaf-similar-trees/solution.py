# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: TreeNode, root2: TreeNode) -> bool:
        self.list1, self.list2 = list(), list()
        
        self.dfs(root1, self.list1)
        self.dfs(root2, self.list2)
        
        return self.list1 == self.list2
    
    def dfs(self, root: TreeNode, l: List[int]) -> None:
        if root == None:
            return
        
        if root.left == None and root.right == None:
            l.append(root.val)
        self.dfs(root.left, l)
        self.dfs(root.right, l)