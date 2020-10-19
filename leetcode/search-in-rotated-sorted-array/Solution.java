class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    
    private int search(int[] nums, int lo, int hi, int target) {
        if (lo > hi)    // not found
            return -1;
        
        int mid = lo + (hi - lo) / 2;
        
        if (nums[mid] == target)    // found
            return mid;
        
        if (nums[lo] <= nums[mid]) {    // nums[lo...mid] is sorted
            if (nums[lo] <= target && target <= nums[mid])   // target lies in nums[lo...mid]
                return search(nums, lo, mid-1, target);
            
            return search(nums, mid+1, hi, target);
        }
        
        
        // nums[mid...hi] is sorted
        if (nums[mid] <= target && target <= nums[hi])
            return search(nums, mid+1, hi, target);

        return search(nums, lo, mid-1, target);
    }
}