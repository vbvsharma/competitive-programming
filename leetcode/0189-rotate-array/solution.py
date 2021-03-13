class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if k % len(nums) == 0:
            return
        
        numbers_moved = 0
        nums_len = len(nums)
        
        start = 0
        while numbers_moved < nums_len:
            put_to_index = (start + k) % nums_len
            num_to_put = nums[start]
            put_from_index = None
            
            while start != put_from_index:
                tmp = nums[put_to_index]
                nums[put_to_index] = num_to_put
                num_to_put = tmp
                put_from_index = put_to_index
                put_to_index = (put_to_index + k) % nums_len
                numbers_moved += 1
            
            start += 1