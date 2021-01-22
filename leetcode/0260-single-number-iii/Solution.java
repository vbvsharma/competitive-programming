class Solution {
    public int[] singleNumber(int[] nums) {
        int a_xor_b = 0;
        for (int num : nums) {
            a_xor_b = a_xor_b ^ num;
        }
        
        int bitFlag = 0;
        for (int i = 0; i < 32; i++) {
            bitFlag = 1 << i;
            if ((bitFlag & a_xor_b) == bitFlag)
                break;
        }
        
        int a = 0, b = 0;
        for (int num : nums) {
            if ((bitFlag & num) == bitFlag) {
                a = a ^ num;
            } else {
                b = b ^ num;
            }
        }
        
        return new int[]{a, b};
    }
}