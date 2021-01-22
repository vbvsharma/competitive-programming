class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        
        for (int shift = 0; shift < 32; shift++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                count += (nums[i] >>> shift) & 1;
            }
            int set = (count % 3) << shift;
            singleNumber = singleNumber + set; 
        }
        
        return singleNumber;
    }
}