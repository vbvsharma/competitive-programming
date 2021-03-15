class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int put = 0;
        
        for (int pick = 0; pick < nums.size(); pick++) {
            if (nums[pick] != 0) {
                nums[put] = nums[pick];
                put++;
            }
        }
        
        while (put < nums.size()) {
            nums[put] = 0;
            put++;
        }
    }
};