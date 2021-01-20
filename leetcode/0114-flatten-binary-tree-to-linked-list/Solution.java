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
    TreeNode lastNode;
    
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        
        lastNode = root;
        flattenHelper(lastNode);
    }
    
    private void flattenHelper(TreeNode root) {
        if (root == null)
            return;
        
        TreeNode right = root.right;
        
        if (root.left != null) {
            lastNode.right = root.left;
            lastNode = root.left;
            root.left = null;
            flattenHelper(lastNode);
        }
        
        if (right != null) {
            lastNode.right = right;
            lastNode = right;
            flattenHelper(lastNode);
        }
    }
}