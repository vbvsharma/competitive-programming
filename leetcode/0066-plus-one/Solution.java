class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] = digits[i] + carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }
        
        if (carry == 0)
            return digits;
        
        int[] a = new int[digits.length+1];
        a[0] = 1;
        for (int i = 1; i < a.length; i++)
            a[i] = digits[i-1];
        
        return a;
    }
}