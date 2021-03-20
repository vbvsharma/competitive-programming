class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        buyPrice = prices[0]
        
        for i in range(1, len(prices)):
            if maxProfit < prices[i] - buyPrice:
                maxProfit = prices[i] - buyPrice
            
            if prices[i] < buyPrice:
                buyPrice = prices[i]
        
        return maxProfit;