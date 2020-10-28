class Solution {
    public void moveZeroes(int[] nums) {
        int moveTo = -1, moveFrom = 0;
        
        while (moveFrom < nums.length) {
            if (nums[moveFrom] != 0) {
                nums[++moveTo] = nums[moveFrom];
            }
            moveFrom++;
        }
        
        moveTo++;
        while (moveTo < nums.length) {
            nums[moveTo++] = 0;
        }
    }
}