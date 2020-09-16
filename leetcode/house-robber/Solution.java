class Solution {
    public int rob(int[] nums) {   
        if (nums.length == 0)
            return 0;
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        for (int i = 1; i < dp.length; i++) {
            int rob1 = nums[i], rob2 = 0;
            
            if (i >= 2)
                rob1 += dp[i-2];
            if (i >= 1)
                rob2 = dp[i-1];
            
            dp[i] = Math.max(rob1, rob2);
        }
        
        return dp[nums.length-1];
    }
}