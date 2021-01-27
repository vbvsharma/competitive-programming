class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] < 0)
                return index + 1;
            
            nums[index] = -nums[index];
        }
        
        return -1;
    }
}