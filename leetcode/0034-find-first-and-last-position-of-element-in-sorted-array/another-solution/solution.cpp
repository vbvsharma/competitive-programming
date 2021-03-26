class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans(2);
        ans[0] = -1;
        ans[1] = -1;
        
        int lo = findFirst(nums, target);
        ans[0] = lo < nums.size() && nums[lo] == target ? lo : -1;
        if (ans[0] == -1)
            return ans;
        
        ans[1] = findFirst(nums, target + 1) - 1;
        return ans;
    }
    
    int findFirst(vector<int>& nums, int target) {
        int lo = 0, hi = nums.size();
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        return lo;
    }
};