class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        int lo = findFirst(nums, target);
        ans[0] = lo < nums.length && nums[lo] == target ? lo : -1;
        if (ans[0] == -1)
            return ans;
        
        ans[1] = findFirst(nums, target + 1) - 1;
        return ans;
    }
    
    private int findFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        return lo;
    }
}