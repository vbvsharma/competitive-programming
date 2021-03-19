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
    vector<TreeNode*> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            vector<TreeNode*> ans;
            return ans;
        }
        
        vector<vector<TreeNode*>> cache(n+1);
        for (int i = 1; i <= n; i++) {
            vector<TreeNode*> tmp;
            cache[i] = tmp;
        }
        
        cache[1].push_back(new TreeNode());
        for (int i = 3; i <= n; i++) {
            for (int left = 1; left < i; left += 2) {
                int right = i - left - 1;
                for (auto nodeLeftIt = cache[left].begin();
                        nodeLeftIt != cache[left].end(); ++nodeLeftIt) {
                    for (auto nodeRightIt = cache[right].begin();
                            nodeRightIt != cache[right].end(); ++nodeRightIt) {
                        TreeNode* root = new TreeNode();
                        root->left = *nodeLeftIt;
                        root->right = *nodeRightIt;
                        cache[i].push_back(root);
                    }
                }
            }
        }
        
        return cache[n];
    }
};