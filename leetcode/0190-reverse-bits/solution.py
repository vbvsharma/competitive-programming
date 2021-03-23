class Solution:
    def reverseBits(self, n: int) -> int:
        rev = 0
        
        for i in range(32):
            if n & 1:
                rev += 1 << (31 - i)
            n = n >> 1
        
        return rev