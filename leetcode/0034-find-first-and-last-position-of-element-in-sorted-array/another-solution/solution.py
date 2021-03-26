class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        ans = list()
        ans.append(-1)
        ans.append(-1)
        
        lo = self.findFirst(nums, target)
        
        ans[0] = lo if lo < len(nums) and nums[lo] == target else -1
        
        if ans[0] == -1:
            return ans
        
        ans[1] = self.findFirst(nums, target + 1) - 1
        return ans
        
    
    def findFirst(self, nums: List[int], target: int):
        lo, hi = 0, len(nums)
        
        while lo < hi:
            mid = lo + (hi - lo) // 2
            
            if nums[mid] < target:
                lo = mid + 1
            else:
                hi = mid
        
        return lo