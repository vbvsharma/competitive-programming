# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        traversal = list()
        
        if root == None:
            return traversal
        
        q = deque()
        q.append(root)
        q.append(None)
        
        level = 0
        traversal.append(list())
        
        while len(q) != 0:
            node = q.popleft()
            
            if (node == None):
                level += 1
                
                if len(q) != 0:
                    q.append(None)
                    traversal.append(list())
                
                continue
            
            if node.left:
                q.append(node.left)
            if node.right:
                q.append(node.right)
                
            traversal[level].append(node.val)
        
        return traversal