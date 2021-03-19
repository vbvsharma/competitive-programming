# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def allPossibleFBT(self, n: int) -> List[TreeNode]:
        if n % 2 == 0:
            return list()
        
        cache = list()
        for _ in range(n+2):
            cache.append(list())
        
        cache[1].append(TreeNode())
        
        for i in range(3, n+1):
            for left in range(1, n, 2):
                right = i - left - 1
                
                for leftNode in cache[left]:
                    for rightNode in cache[right]:
                        root = TreeNode()
                        root.left = leftNode
                        root.right = rightNode
                        cache[i].append(root)
        
        return cache[n]