class Solution {
    public int removeDuplicates(int[] nums) {
        int insertTo = 0;
        
        for (int insertFrom = 1; insertFrom < nums.length; insertFrom++) {
            if (nums[insertTo] != nums[insertFrom]) {
                nums[++insertTo] = nums[insertFrom];
            }
        }
        
        return insertTo+1;
    }
}