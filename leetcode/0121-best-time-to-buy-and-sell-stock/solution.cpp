class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit = 0, buyPrice = prices[0];
        
        for (int i = 1; i < prices.size(); i++) {
            if (maxProfit < prices[i] - buyPrice)
                maxProfit = prices[i] - buyPrice;
            
            if (prices[i] < buyPrice)
                buyPrice = prices[i];
        }
        
        return maxProfit;
    }
};