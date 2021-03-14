class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        vector<int> ans;
        int n1 = nums1.size();
        int n2 = nums2.size();
        int i1 = 0;
        int i2 = 0;
        while (i1 < n1 && i2 < n2) {
            while (i1 < n1 && i2 < n2 && nums1[i1] == nums2[i2]) {
                ans.push_back(nums1[i1]);
                i1++;
                i2++;
            }
            if (i1 < n1 && i2 < n2 && nums1[i1] < nums2[i2]) {
                while (i1 < n1 && nums1[i1] < nums2[i2])    i1++;
            } else if (i1 < n1 && i2 < n2) {
                while (i2 < n2 && nums1[i1] > nums2[i2])    i2++;
            }
        }
        return ans;
    }
};