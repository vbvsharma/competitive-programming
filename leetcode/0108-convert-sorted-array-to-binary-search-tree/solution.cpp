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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return sortedArrayToBST(nums, 0, nums.size()-1);
    }
    
    TreeNode* sortedArrayToBST(vector<int>& nums, int lo, int hi) {
        if (hi < lo)
            return nullptr;
        int mid = (lo + hi) / 2;
        TreeNode* newTreeNode = new TreeNode(nums[mid]);
        newTreeNode->left = sortedArrayToBST(nums, lo, mid-1);
        newTreeNode->right = sortedArrayToBST(nums, mid+1, hi);
        return newTreeNode;
    }
};