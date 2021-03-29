# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        if root == None:
            return root
        
        ansHead, ansTail = None, None
        stack = []
        store = root
        
        while len(stack) != 0 or store != None:
            if store != None:
                stack.append(store)
                store = store.left
            else:
                top = stack.pop()
                
                if ansHead == None:
                    ansHead = top
                    ansTail = top
                else:
                    ansTail.right = top
                    ansTail = top
                    
                top.left = None
                
                store = top.right
        
        return ansHead