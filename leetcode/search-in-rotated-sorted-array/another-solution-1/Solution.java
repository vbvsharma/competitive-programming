class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target)    // found
                return mid;
            
            if (nums[lo] <= nums[mid]) {    // nums[lo...mid] is sorted
                if (nums[lo] <= target && target <= nums[mid])   // target lies in nums[lo...mid]
                    hi = mid-1;
                else
                    lo = mid+1;
            } else {
                // nums[mid...hi] is sorted
                if (nums[mid] <= target && target <= nums[hi])
                    lo = mid+1;
                else
                    hi = mid-1;
            }
        }
        
        return -1;
    }
}