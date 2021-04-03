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
    int tilt = 0;
    public int findTilt(TreeNode root) {
        findSum(root);
        return tilt;
    }
    
    private int findSum(TreeNode root) {
        if (root == null)
            return 0;
        
        int leftSubtree = findSum(root.left);
        int rightSubtree = findSum(root.right);
        
        tilt += Math.abs(leftSubtree - rightSubtree);
        
        return leftSubtree + root.val + rightSubtree;
    }
}