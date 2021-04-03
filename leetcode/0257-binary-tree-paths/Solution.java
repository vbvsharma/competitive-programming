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
    List<String> answer = new LinkedList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return answer;
        binaryTreePaths(root, new StringBuilder());
        return answer;
    }
    
    private void binaryTreePaths(TreeNode root, StringBuilder path) {
        path.append(root.val);
        if (root.left == null && root.right == null)
            answer.add(path.toString());
        if (root.left != null) {
            StringBuilder tmp = new StringBuilder(path);
            tmp.append("->");
            binaryTreePaths(root.left, tmp);
        }
        if (root.right != null) {
            StringBuilder tmp = new StringBuilder(path);
            tmp.append("->");
            binaryTreePaths(root.right, tmp);
        }
    }
}