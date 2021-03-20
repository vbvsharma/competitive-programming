// Forward declaration of isBadVersion API.
bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int lo, int hi) {
        if (lo == hi)
            return lo;
        int mid = lo + (hi - lo) / 2;
        if (isBadVersion(mid)) {
            return firstBadVersion(lo, mid);
        } else {
            return firstBadVersion(mid+1, hi);
        }
    }
    
    int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }
};