class Solution {
    public int removeDuplicates(int[] nums) {
        int copyTo = 0, copyFrom = 0;
        while (copyFrom < nums.length) {
            nums[copyTo] = nums[copyFrom];
            int i = copyFrom + 1;
            while (i < nums.length && nums[copyTo] == nums[i])
                i++;
            copyTo++;
            copyFrom = i;
        }
        
        return copyTo;
    }
}