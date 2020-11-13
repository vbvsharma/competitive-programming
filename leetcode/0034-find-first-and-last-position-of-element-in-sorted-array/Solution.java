class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = lowerBound(nums, 0, nums.length - 1, target);
        ans[0] = (ans[0] < nums.length && 0 <= ans[0] && nums[ans[0]] == target) ? ans[0] : -1;
        ans[1] = upperBound(nums, 0, nums.length - 1, target);
        ans[1] = (ans[1] < nums.length && 0 <= ans[1] && nums[ans[1]] == target) ? ans[1] : -1;
        
        return ans;
    }
    
    private int lowerBound(int[] nums, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = (hi + lo) / 2;
            if (nums[mid] >= target)
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
    
    private int upperBound(int[] nums, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = (hi + lo + 1) / 2;
            if (nums[mid] <= target)
                lo = mid;
            else
                hi = mid - 1;
        }
        
        return hi;
    }
}