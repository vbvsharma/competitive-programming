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
    TreeNode* increasingBST(TreeNode* root) {
        if (!root)
            return root;
        
        TreeNode *ansHead = NULL, *ansTail = NULL;
        stack<TreeNode*> s;
        TreeNode *store = root;
        
        while (!s.empty() || store != NULL) {
            if (store != NULL) {
                s.push(store);
                store = store->left;
            } else {
                TreeNode *top = s.top();
                s.pop();
                if (ansHead == NULL) {
                    ansHead = top;
                    ansTail = top;
                } else {
                    ansTail->right = top;
                    ansTail = top;
                }
                
                top->left = NULL;
                
                store = top->right;
            }
        }
        
        return ansHead;
    }
};