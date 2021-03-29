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
    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return root;
        
        TreeNode ansHead = null, ansTail = null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode store = root;
        
        while (!stack.isEmpty() || store != null) {
            if (store != null) {
                stack.add(store);
                store = store.left;
            } else {
                TreeNode top = stack.pop();
                
                if (ansHead == null) {
                    ansHead = top;
                    ansTail = top;
                } else {
                    ansTail.right = top;
                    ansTail = top;
                }
                
                top.left = null;
                
                store = top.right;
            }
        }
        
        return ansHead;
    }
}