# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:
        return self.sortedArrayToBSTUtil(nums, 0, len(nums) - 1)
    
    def sortedArrayToBSTUtil(self, nums: List[int], left: int, right: int) -> TreeNode:
        if right < left:
            return None
        
        if left == right:
            return TreeNode(nums[left])
        
        mid = left + (right - left) // 2
        newNode = TreeNode(nums[mid])
        newNode.left = self.sortedArrayToBSTUtil(nums, left, mid - 1)
        newNode.right = self.sortedArrayToBSTUtil(nums, mid + 1, right)
        
        return newNode