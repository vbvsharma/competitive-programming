class Solution {
    public int removeElement(int[] nums, int val) {
        int copyTo = 0, copyFrom = 0;
        while (copyFrom < nums.length) {
            if (nums[copyFrom] != val)
                nums[copyTo++] = nums[copyFrom];
            copyFrom++;
        }
        
        return copyTo;
    }
}