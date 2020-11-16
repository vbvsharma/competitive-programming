class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        int[] freq = new int[n+1];
        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] > 1)
                return nums[i];
        }
        
        return -1;
    }
}