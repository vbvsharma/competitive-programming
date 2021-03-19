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
    bool isValidBST(TreeNode* root, int *minVal, int *maxVal) {
        if (root == nullptr)
            return true;
        if (minVal != nullptr && root->val <= *minVal)
            return false;
        if (maxVal != nullptr && *maxVal <= root->val)
            return false;
        
        return isValidBST(root->left, minVal, &root->val) && isValidBST(root->right, &root->val, maxVal);
    }
    
    bool isValidBST(TreeNode* root) {
        return isValidBST(root, nullptr, nullptr);
    }
};