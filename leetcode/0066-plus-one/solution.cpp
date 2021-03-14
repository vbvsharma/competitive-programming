class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int carry = 1;
        
        for (int i = digits.size() - 1; i >= 0; i--) {
            int tmp = digits[i] + carry;
            digits[i] = tmp % 10;
            carry = tmp / 10;
        }
        
        if (carry == 0)
            return digits;
        
        vector<int> ans(1 + digits.size());
        ans[0] = carry;
        for (int i = 0; i < digits.size(); i++)
            ans[i + 1] = digits[i];
        
        return ans;
    }
};