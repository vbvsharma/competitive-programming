class Solution {
public:
    int countPrimes(int n) {
        if (n <= 1)
            return 0;
        
        bool isPrime[n];
        
        for (int i = 1; i < n; i++)
            isPrime[i] = true;
        
        int count = 0;
        isPrime[1] = false;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                int j = 2 * i;
                count++;
                while (j < n) {
                    isPrime[j] = false;
                    j += i;
                }
            }
        }
        
        return count;
    }
};