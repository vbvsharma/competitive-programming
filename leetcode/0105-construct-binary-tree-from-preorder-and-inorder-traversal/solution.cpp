/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return buildTree(preorder, 0, preorder.size()-1, inorder, 0, inorder.size()-1);
    }
    
    TreeNode* buildTree(vector<int>& preorder, int pStart, int pEnd, vector<int>& inorder, int iStart, int iEnd) {
        if (pEnd < pStart)
            return nullptr;
        
        if (pStart == pEnd)
            return new TreeNode(preorder[pStart]);
        
        TreeNode* root = new TreeNode(preorder[pStart]);
        auto iterIndexOfRootInorder = find(inorder.begin() + iStart, inorder.begin() + iEnd+1, preorder[pStart]);
        int indexOfRootInorder = iterIndexOfRootInorder - inorder.begin();
        int numOfNodesInLeftSubTree = indexOfRootInorder - iStart;
        int numOfNodesInRightSubTree = iEnd - indexOfRootInorder;
        root->left = buildTree(preorder, pStart+1, pStart + numOfNodesInLeftSubTree,
                               inorder, iStart, indexOfRootInorder - 1);
        root->right = buildTree(preorder, pStart + numOfNodesInLeftSubTree + 1, pEnd,
                                inorder, indexOfRootInorder + 1, iEnd);
        
        return root;
    }
};