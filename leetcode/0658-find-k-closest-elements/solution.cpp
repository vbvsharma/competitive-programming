class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int n = arr.size();
        
        int lo = 0, hi = arr.size() - k;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (x - arr[mid] > arr[mid + k] - x)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        vector<int> ans(k);
        for (int i = lo; i < lo + k; i++)
            ans[i - lo] = arr[i];
        
        return ans;
    }
};