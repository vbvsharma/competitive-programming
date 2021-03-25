class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        return self.findPeakElementUtil(nums, 0, len(nums) - 1)
    
    def findPeakElementUtil(self, nums: List[int], lo: int, hi: int) -> int:
        if lo == hi:
            return lo;
        
        mid = lo + (hi - lo) // 2
        if nums[mid] < nums[mid + 1]:
            return self.findPeakElementUtil(nums, mid + 1, hi);
        return self.findPeakElementUtil(nums, lo, mid);