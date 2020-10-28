class Solution {
    private boolean[][] isPalindrome;
    
    public String longestPalindrome(String s) {
        int n = s.length();
        
        if (n <= 1)
            return s;
        
        char[] sChars = s.toCharArray();
        
        int start = 0, end = 0;
        for (int i = 0; i < n-1; i++) {
            int len1 = expandAroundCenter(sChars, i, i);
            int len2 = expandAroundCenter(sChars, i, i+1);
            
            int len = Math.max(len1, len2);
            
            if (len > (end - start + 1)) {
                start = i - (len + 1) / 2 + 1;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end+1);
    }
    
    private int expandAroundCenter(char[] s, int L, int R) {
        if (s[L] != s[R])
            return 0;
        
        while (L >= 0 && R < s.length && s[L] == s[R]) {
            L--;
            R++;
        }
        
        return R - L - 1;
    }
}