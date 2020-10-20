class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;
        
        int small = Integer.MAX_VALUE, large = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= small) {
                small = nums[i];
            } else if (nums[i] <= large) {
                large = nums[i];
            } else {
                return true;
            }
        }
        
        return false;
    }
}