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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        
        if (root == null)
            return traversal;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        traversal.add(new ArrayList<>());
        
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            
            if (node == null) {
                level++;
                
                if (!q.isEmpty()) {
                    q.add(null);
                    traversal.add(new ArrayList<>());
                }
                
                continue;
            }
            
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
            
            traversal.get(level).add(node.val);
        }
        
        return traversal;
    }
}