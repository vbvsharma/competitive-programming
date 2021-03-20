class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        
        cache = list()
        
        cache.append(1)
        cache.append(2)
        
        for i in range(2, n):
            cache.append(cache[i - 1] + cache[i - 2])
        
        return cache[n - 1]