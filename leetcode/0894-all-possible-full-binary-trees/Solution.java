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
    
    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            List<TreeNode> list = new ArrayList<>();
            return list;
        }
        
        List<TreeNode>[] cache = new ArrayList[n+1];
        for (int i = 0; i <= n; i++)
            cache[i] = new ArrayList<>();
        
        cache[1].add(new TreeNode());
        
        for (int i = 3; i <= n; i += 2) {
            for (int left = 1; left < i; left += 2) {
                int right = i - left - 1;
                
                for (TreeNode nodeLeft : cache[left]) {
                    for (TreeNode nodeRight: cache[right]) {
                        TreeNode root = new TreeNode();
                        root.left = nodeLeft;
                        root.right = nodeRight;
                        cache[i].add(root);
                    }
                }
            }
        }
        
        return cache[n];
    }
}