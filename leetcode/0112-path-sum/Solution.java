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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return hasPathSum(root, targetSum, 0);
    }
    
    private boolean hasPathSum(TreeNode root, int targetSum, int pathSum) {
        if (root.left == null && root.right == null)
            return pathSum + root.val == targetSum;
        
        boolean answer = false;
        if (root.right != null)
            answer = answer || hasPathSum(root.right, targetSum, pathSum + root.val);
        if (root.left != null)
            answer = answer || hasPathSum(root.left, targetSum, pathSum + root.val);
        
        return answer;
    }
}