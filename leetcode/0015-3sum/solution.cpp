class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        
        vector<vector<int>> triplets;
        for (int i = 0; i < nums.size(); i++) {
            if (i >= 1 && nums[i] == nums[i-1])
                continue;
        
            int l = i + 1, r = nums.size() - 1;
            
            while (l < r) {
                if (nums[l] + nums[r] == -nums[i]) {
                    vector<int> triplet(3);
                    triplet[0] = nums[i];
                    triplet[1] = nums[l];
                    triplet[2] = nums[r];
                    
                    triplets.push_back(triplet);
                    l++;
                    r--;
                    
                    while (l < r && nums[l] == nums[l-1])   l++;
                    while (l < r && nums[r] == nums[r+1])   r--;
                } else if (nums[l] + nums[r] < -nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        
        return triplets;
    }
};