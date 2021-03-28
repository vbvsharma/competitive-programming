class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        lo, hi = 1, num
        while lo < hi:
            mid = lo + (hi - lo) // 2
            
            if mid * mid == num:
                return True
            elif mid * mid < num:
                lo = mid + 1
            else:
                hi = mid - 1
        
        return lo * lo == num