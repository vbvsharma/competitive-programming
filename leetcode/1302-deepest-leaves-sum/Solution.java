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
    int maxDepth = 0, sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return sum;
        
        return deepestLeavesSum(root, 0);
    }
    
    private int deepestLeavesSum(TreeNode root, int depth) {
        if (root == null)
            return sum;
        
        if (depth == maxDepth) {
            sum += root.val;
        } else if (depth > maxDepth) {
            maxDepth = depth;
            sum = root.val;
        }
        
        deepestLeavesSum(root.left, depth + 1);
        deepestLeavesSum(root.right, depth + 1);
        
        return sum;
    }
}