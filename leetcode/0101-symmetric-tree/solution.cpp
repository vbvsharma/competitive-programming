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
    bool isMirror(TreeNode* leftTree, TreeNode* rightTree) {
        if (leftTree == nullptr && rightTree == nullptr)
            return true;
        if (leftTree == nullptr || rightTree == nullptr)
            return false;
        
        return (leftTree->val == rightTree->val) &&
               isMirror(leftTree->left, rightTree->right) &&
               isMirror(leftTree->right, rightTree->left);
    }
    
    bool isSymmetric(TreeNode* root) {
        return isMirror(root, root);
    }
};