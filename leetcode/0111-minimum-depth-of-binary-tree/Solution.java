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
    int minDepth = Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        depth(root, 0);
        
        return minDepth;
    }
    
    private void depth(TreeNode root, int d) {
        if (root.left == null && root.right == null)
            minDepth = Math.min(d + 1, minDepth);
        
        if (root.left != null)
            depth(root.left, d + 1);
        if (root.right != null)
            depth(root.right, d + 1);
    }
}