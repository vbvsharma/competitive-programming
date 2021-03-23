class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        int rev = 0;
        int i = 0;
        while (i < 32) {
            if (n & 1) {
                rev += 1 << (31 - i);
            }
            n = n >> 1;
            i++;
        }
        return rev;
    }
};