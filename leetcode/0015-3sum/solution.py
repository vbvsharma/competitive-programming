class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        
        triplets = list()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
                
            if i >= 1 and nums[i] == nums[i - 1]:
                continue
        
            l = i + 1
            r = len(nums) - 1
            
            while l < r:
                if nums[l] + nums[r] == -nums[i]:
                    triplets.append([nums[i], nums[l], nums[r]])
                    
                    l += 1
                    r -= 1
                    
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1 
                elif nums[l] + nums[r] < -nums[i]:
                    l += 1
                else:
                    r -= 1
            
        return triplets