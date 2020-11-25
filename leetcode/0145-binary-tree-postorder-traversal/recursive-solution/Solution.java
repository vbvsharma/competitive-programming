/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> traversal = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return traversal;
        
        traversal = postorderTraversal(root.left);
        traversal = postorderTraversal(root.right);
        traversal.add(root.val);
        
        return traversal;
    }
}