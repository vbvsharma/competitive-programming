class Solution {
public:
    int search(vector<int>& nums, int target) {
        return search(nums, 0, nums.size() - 1, target);
    }
    
    int search(vector<int>& nums, int lo, int hi, int target) {
        if (lo > hi)
            return -1;
        
        int mid = lo + (hi - lo) / 2;
        
        if (nums[mid] == target)
            return mid;
        
        if (nums[mid] < nums[hi]) {
            if (nums[mid] < target && target <= nums[hi])
                return search(nums, mid + 1, hi, target);
            else
                return search(nums, lo, mid - 1, target);
        } else {
            if (nums[lo] <= target && target < nums[mid])
                return search(nums, lo, mid - 1, target);
            else
                return search(nums, mid + 1, hi, target);
        }
    }
};