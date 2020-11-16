class Solution {
    public boolean canJump(int[] nums) {
        int leftMostGoodPosition = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {            
            if (leftMostGoodPosition <= i + nums[i])
                leftMostGoodPosition = i;
        }
        
        return leftMostGoodPosition == 0;
    }
}