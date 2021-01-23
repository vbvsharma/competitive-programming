class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] < 0)
                nums[i] = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0)
                continue;
            
            mark(nums, nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++)
            if (0 <= nums[i])
                return i + 1;
        
        return nums.length + 1;
    }
    
    private void mark(int[] nums, int numToMark) {
        if (nums.length < numToMark || nums[numToMark - 1] < 0)
            return;
        
        int tmp = nums[numToMark - 1];
        nums[numToMark - 1] = -numToMark;
        
        if (0 < tmp)
            mark(nums, tmp);
    }
}