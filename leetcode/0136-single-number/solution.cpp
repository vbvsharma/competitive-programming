class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int cumm_xor = 0;
        
        for (int i = 0; i < nums.size(); i++)
            cumm_xor = cumm_xor ^ nums[i];
        
        return cumm_xor;
    }
};