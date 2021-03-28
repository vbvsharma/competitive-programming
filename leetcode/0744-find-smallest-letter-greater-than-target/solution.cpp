class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int lo = 0, hi = letters.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (target < letters[mid])
                hi = mid;
            else
                lo = mid + 1;
        }

        return hi == letters.size() ? letters[0] : letters[hi];
    }
};