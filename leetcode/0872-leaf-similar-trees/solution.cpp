/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> list1, list2;
    
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        dfs(root1, list1);
        dfs(root2, list2);
        
        if (list1.size() != list2.size())
            return false;
        
        for (int i = 0; i < list1.size(); i++) {
            if (list1[i] != list2[i])
                return false;
        }
        
        return true;
    }
    
    void dfs(TreeNode* root, vector<int>& list) {
        if (root == NULL)
            return;
        
        if (root->left == NULL && root->right == NULL)
            list.push_back(root->val);
        dfs(root->left, list);
        dfs(root->right, list);
    }
};