class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        size = len(nums)
        
        if size <= 1:
            return size
        put = 0
        pick = 0
        
        while pick < size:
            if nums[put] != nums[pick]:
                nums[put + 1] = nums[pick]
                put = put + 1
            pick = pick + 1
        return ""
        return put + 1