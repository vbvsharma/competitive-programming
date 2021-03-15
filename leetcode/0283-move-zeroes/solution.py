class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        put = 0
        
        for pick in range(len(nums)):
            if nums[pick] != 0:
                nums[put] = nums[pick]
                put += 1
            
        while put < len(nums):
            nums[put] = 0
            put += 1