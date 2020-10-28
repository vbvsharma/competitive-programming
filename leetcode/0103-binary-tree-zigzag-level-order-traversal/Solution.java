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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> order = new ArrayList<>();
        if (root == null)
            return order;
        ArrayList<TreeNode> nodeList = new ArrayList<>();
        boolean left2Right = true;
        nodeList.add(root);
        
        while (!nodeList.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            ArrayList<TreeNode> tempNodeList = new ArrayList<>();
            
            if (left2Right) {
                for (int i = nodeList.size()-1; i >= 0; i--) {
                    TreeNode top = nodeList.get(i);
                    level.add(top.val);
                    if (top.left != null)
                        tempNodeList.add(top.left);
                    if (top.right != null)
                        tempNodeList.add(top.right);
                }
            } else {
                for (int i = nodeList.size()-1; i >= 0; i--) {
                    TreeNode top = nodeList.get(i);
                    level.add(top.val);
                    if (top.right != null)
                        tempNodeList.add(top.right);
                    if (top.left != null)
                        tempNodeList.add(top.left);
                }
            }
            
            order.add(level);
            left2Right = !left2Right;
            nodeList = tempNodeList;
        }
        
        return order;
    }
}