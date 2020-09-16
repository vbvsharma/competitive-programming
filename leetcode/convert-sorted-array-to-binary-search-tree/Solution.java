/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        if (lo > hi)
            return null;
        if (lo == hi)
            return new TreeNode(nums[lo], null, null);
        
        int mid = (lo + hi) / 2;
        
        TreeNode leftSubTree = sortedArrayToBST(nums, lo, mid-1);
        TreeNode rightSubTree = sortedArrayToBST(nums, mid+1, hi);
        return new TreeNode(nums[mid], leftSubTree, rightSubTree);
    }
}