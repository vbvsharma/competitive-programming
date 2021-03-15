class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexMap = dict()
        
        for i in range(len(nums)):
            index = indexMap.get(target - nums[i], -1)
            if index != -1:
                ans = list()
                ans.append(index)
                ans.append(i)
                return ans
            
            indexMap[nums[i]] = i
        
        return None