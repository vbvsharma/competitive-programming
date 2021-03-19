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
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> traversal;
        
        if (root == NULL)
            return traversal;
        
        queue<TreeNode*> q;
        q.push(root);
        q.push(NULL);
        int level = 0;
        vector<int> tmp1;
        traversal.push_back(tmp1);
        
        while (!q.empty()) {
            TreeNode* node = q.front();
            q.pop();
            
            if (node == NULL) {
                level++;
                
                if (!q.empty()) {
                    q.push(NULL);
                    vector<int> tmp2;
                    traversal.push_back(tmp2);
                }
                
                continue;
            }
            
            if (node->left != NULL)
                q.push(node->left);
            if (node->right != NULL)
                q.push(node->right);
            
            traversal[level].push_back(node->val);
        }
        
        return traversal;
    }
};