class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (maxProfit < prices[i] - buyPrice)
                maxProfit = prices[i] - buyPrice;
            
            if (buyPrice > prices[i]) 
                buyPrice = prices[i];
        }
        
        return maxProfit;
    }
}