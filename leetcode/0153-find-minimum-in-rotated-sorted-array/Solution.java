class Solution {
    public int findMin(int[] nums) {
        return nums[findMin(nums, 0, nums.length - 1)];
    }
    
    private int findMin(int[] nums, int lo, int hi) {
        if (lo == hi)
            return lo;
        
        int mid = lo + (hi - lo) / 2;
        
        if (nums[lo] < nums[hi])
            return findMin(nums, lo, mid);
        if (nums[mid] < nums[hi])
            return findMin(nums, lo, mid);
        return findMin(nums, mid + 1, hi);
    }
}