class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        
        for (int i = 0; i < memo.length; i++)
            memo[i] = -1;
        
        memo[0] = 0;
        
        for (int i = 0; i < memo.length; i++) {
            if (memo[i] == -1)
                continue;
            
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] > amount || i + coins[j] >= memo.length)
                    continue;
                
                if (memo[i + coins[j]] == -1)
                    memo[i + coins[j]] = memo[i] + 1;
                else if (1 + memo[i] < memo[i + coins[j]])
                    memo[i + coins[j]] = 1 + memo[i];
            }
        }
        
        return memo[amount];
    }
}