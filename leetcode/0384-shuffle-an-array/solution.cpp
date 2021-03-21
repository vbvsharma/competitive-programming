class Solution {
public:
    vector<int> originalNums;
    vector<int> nums;
    
    Solution(vector<int>& nums) {
        originalNums = nums;
        this->nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    vector<int> reset() {
        this->nums = originalNums;
        return this->nums;
    }
    
    /** Returns a random shuffling of the array. */
    vector<int> shuffle() {
        int sz = nums.size();
        for (int i = 0; i < sz; i++) {
            int idx = rand() % sz;
            int tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }
        
        return nums;
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(nums);
 * vector<int> param_1 = obj->reset();
 * vector<int> param_2 = obj->shuffle();
 */