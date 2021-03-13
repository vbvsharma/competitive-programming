class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;
        
        if (k == 0)
            return;
        
        int count = 0;
        for (int startPos = 0; count < n; startPos++) {
            int prevVal = nums[startPos];
            int currPos = startPos;
            
            do {
                int nextPos = (currPos + k) % n;
                int temp = nums[nextPos];
                nums[nextPos] = prevVal;
                prevVal = temp;
                currPos = (currPos + k) % n;
                count++;
            } while(currPos != startPos);
        }
    }
};