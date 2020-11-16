class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] cache = new int[nums.length+1];
        
        cache[0] = 0;
        
        int maxLength = 0;
        for (int i = 1; i <= nums.length; i++) {
            cache[i] = 0;
            
            for (int j = i-1; j > 0; j--)
                if (nums[j-1] < nums[i-1])
                    cache[i] = Math.max(cache[i], cache[j]);
            
            cache[i] += 1;
            
            maxLength = Math.max(maxLength, cache[i]);
        }
        
        return maxLength;
    }
}