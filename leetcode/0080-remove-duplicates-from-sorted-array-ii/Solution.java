class Solution {
    public int removeDuplicates(int[] nums) {
        int put = 0;
        int pick = 0;
        while (pick < nums.length) {
            if (put < 2 || nums[put - 2] != nums[pick])
                nums[put++] = nums[pick];
            pick++;
        }
        
        return put;
    }
}