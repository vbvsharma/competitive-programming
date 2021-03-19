class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1, j = n - 1, k = nums1.size() - 1;
        
        while (0 <= k) {
            int num1 = INT_MIN, num2 = INT_MIN;
            if (0 <= i)
                num1 = nums1[i];
            if (0 <= j)
                num2 = nums2[j];
            
            if (num1 < num2) {
                nums1[k--] = num2;
                j--;
            } else {
                nums1[k--] = num1;
                i--;
            }
        }
    }
};