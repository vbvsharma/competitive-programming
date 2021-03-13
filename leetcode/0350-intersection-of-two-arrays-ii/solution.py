class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if len(nums1) > len(nums2):
            return self.intersect(nums2, nums1)
        
        nums1_counter = dict()
        
        for num1 in nums1:
            nums1_counter[num1] = nums1_counter.get(num1, 0) + 1
        
        intersection = list()
        for num2 in nums2:
            count = nums1_counter.get(num2, 0)
            if count > 0:
                nums1_counter[num2] = count - 1
                intersection.append(num2)
        
        return intersection