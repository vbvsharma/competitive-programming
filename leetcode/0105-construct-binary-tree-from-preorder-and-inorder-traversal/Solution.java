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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    
    private int find(int[] arr, int lo, int hi, int key) {
        for (int i = lo; i <= hi; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
    
    private TreeNode buildTree(int[] preorder, int preorderLo, int preorderHi, int[] inorder, int inorderLo, int inorderHi) {
        if (inorderLo > inorderHi)
            return null;
        if (inorderLo == inorderHi)
            return new TreeNode(inorder[inorderLo]);
        
        int rootVal = preorder[preorderLo];
        int rootIndex = find(inorder, inorderLo, inorderHi, rootVal);
        int numOfNodesLeftSubtree = rootIndex - inorderLo;
        int numOfNudesRightSubtree = inorderHi - rootIndex;
        
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder, preorderLo + 1, preorderLo + numOfNodesLeftSubtree,
                              inorder, inorderLo, rootIndex-1);
        root.right = buildTree(preorder, preorderLo + numOfNodesLeftSubtree + 1, preorderHi,
                              inorder, rootIndex+1, inorderHi);
        
        return root;
    }
}