class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1
        j = n - 1
        k = len(nums1) - 1
        
        while 0 <= k:
            num1 = -math.inf
            num2 = -math.inf
            
            if 0 <= i:
                num1 = nums1[i]
            if 0 <= j:
                num2 = nums2[j]
            
            if num1 < num2:
                nums1[k] = num2
                j -= 1
            else:
                nums1[k] = num1
                i -= 1
            k -= 1