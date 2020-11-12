class Solution {
    public int findPeakElement(int[] nums) {
        return findPeakElement(nums, 0, nums.length-1);
    }
    
    private int findPeakElement(int[] nums, int lo, int hi) {
        if (lo == hi)
            return lo;
        
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] < nums[mid + 1])
            return findPeakElement(nums, mid + 1, hi);
        return findPeakElement(nums, lo, mid);
    }
}