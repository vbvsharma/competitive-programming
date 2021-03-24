class Solution:
    def search(self, nums: List[int], target: int) -> int:
        return self.searchUtil(nums, 0, len(nums) - 1, target)
    
    def searchUtil(self, nums: List[int], lo: int, hi: int, target: int) -> int:
        if lo > hi:
            return -1
        
        mid = lo + (hi - lo) // 2
        
        if nums[mid] == target:
            return mid
        
        if nums[mid] < nums[hi]:
            if nums[mid] < target and target <= nums[hi]:
                return self.searchUtil(nums, mid + 1, hi, target)
            else:
                return self.searchUtil(nums, lo, mid - 1, target)
        else:
            if nums[lo] <= target and target < nums[mid]:
                return self.searchUtil(nums, lo, mid - 1, target)
            else:
                return self.searchUtil(nums, mid + 1, hi, target)