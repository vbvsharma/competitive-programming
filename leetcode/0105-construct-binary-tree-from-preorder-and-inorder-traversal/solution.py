# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        return self.buildTreeUtil(preorder, 0, len(preorder) - 1, inorder, 0, len(inorder) - 1)
    
    def buildTreeUtil(self, preorder :List[int], pStart :int, pEnd: int, inorder: List[int], iStart: int, iEnd: int) -> TreeNode:
        if pEnd < pStart:
            return None
        
        if pStart == pEnd:
            return TreeNode(preorder[pStart])
        
        root = TreeNode(preorder[pStart])
        indexOfRootInorder = inorder.index(root.val, iStart)
        
        numOfNodesInLeftSubTree = indexOfRootInorder - iStart
        numOfNodesInRightSubTree = iEnd - indexOfRootInorder
        root.left = self.buildTreeUtil(preorder, pStart+1, pStart + numOfNodesInLeftSubTree,
                               inorder, iStart, indexOfRootInorder - 1)
        root.right = self.buildTreeUtil(preorder, pStart + numOfNodesInLeftSubTree + 1, pEnd,
                                inorder, indexOfRootInorder + 1, iEnd)
        
        return root