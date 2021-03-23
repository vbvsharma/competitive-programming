class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 1:
            return 0
        
        isPrime = [True] * n
        
        isPrime[0] = False
        isPrime[1] = False
        
        count = 0
        for i in range(2, n):
            if isPrime[i]:
                count += 1
                isPrime[2 * i:n:i] = [False] * len(isPrime[2 * i:n:i])
        
        return count