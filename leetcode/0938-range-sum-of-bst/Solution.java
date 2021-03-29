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
    private int sum, low, high;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        this.low = low;
        this.high = high;
        
        traverse(root);
        
        return sum;
    }
    
    private void traverse(TreeNode root) {
        if (root == null)
            return;
        
        if (low <= root.val && root.val <= high) {
            sum += root.val;
            traverse(root.left);
            traverse(root.right);
        }
        
        if (root.val < low)
            traverse(root.right);
        
        if (high < root.val)
            traverse(root.left);
    }
}