class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> indexMap;
        
        vector<int> ans(2);
        for (int i = 0; i < nums.size(); i++) {
            if (indexMap.find(target - nums[i]) != indexMap.end()) {
                ans[0] = indexMap[target - nums[i]];
                ans[1] = i;
                return ans;
            }
            
            indexMap[nums[i]] = i;
        }
        
        return ans;
    }
};