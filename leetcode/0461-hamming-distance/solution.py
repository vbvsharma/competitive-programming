class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor = x ^ y
        
        hammingDist = 0
        while xor:
            hammingDist += xor & 1
            xor = xor >> 1
        
        return hammingDist