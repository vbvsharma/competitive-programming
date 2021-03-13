class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int size = nums.size();
        if (size <= 1)
            return size;
        
        int put = 0, pick = 0;
        while (pick < size) {
            if (nums[put] != nums[pick]) {
                nums[put + 1] = nums[pick];
                ++put;
            }
            ++pick;
        }
        
        return put + 1;
    }
};