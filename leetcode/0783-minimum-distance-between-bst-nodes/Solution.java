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
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;
    
    public int minDiffInBST(TreeNode root) {
        if (root.left != null)
            minDiffInBST(root.left);
        
        if (prev != null)
            min = Math.min(root.val - prev.val, min);
        
        prev = root;
        
        if (root.right != null)
            minDiffInBST(root.right);
        
        return min;
    }
}