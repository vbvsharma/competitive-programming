class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        
        for (int power = 1, i = s.length() - 1; i >= 0; i--, power = power * 26) {
            num += (s.charAt(i) - 'A' + 1) * power;
        }
        
        return num;
    }
}