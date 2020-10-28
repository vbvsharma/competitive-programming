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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> completeTraversal = new LinkedList<>();
        
        if (root == null)
            return completeTraversal;
        
        List<TreeNode> levelTreeNodes = new LinkedList<>();
        levelTreeNodes.add(root);
        
        while (!levelTreeNodes.isEmpty()) {
            List<TreeNode> nextLevelTreeNodes = new LinkedList<>();
            List<Integer> levelTraversal = new LinkedList<>();
            
            for (TreeNode node : levelTreeNodes) {
                levelTraversal.add(node.val);
                
                if (node.left != null)  nextLevelTreeNodes.add(node.left);
                if (node.right != null) nextLevelTreeNodes.add(node.right);
            }
            
            completeTraversal.add(levelTraversal);
            levelTreeNodes = nextLevelTreeNodes;
        }
        
        return completeTraversal;
    }
}