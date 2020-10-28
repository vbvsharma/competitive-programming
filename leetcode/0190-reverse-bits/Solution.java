public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        int leftShift = 31;
        while (n != 0) {
            if ((n & 1) == 1) {
                reversed += 1 << leftShift;
            }
            leftShift--;
            n = n >>> 1;
        }
        
        return reversed;
    }
}