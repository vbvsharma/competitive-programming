class Solution {
    private boolean[][] isPalindrome;
    
    public String longestPalindrome(String s) {
        int n = s.length();
        
        if (n <= 1)
            return s;
        
        isPalindrome = new boolean[n][n];
        
        for (int i = 0; i < n; i++)
            isPalindrome[i][i] = true;
        
        int longestStart = 0, longestEnd = 0;
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                isPalindrome[i][j] = (s.charAt(i) == s.charAt(j) && (i+1 >= j-1 || isPalindrome[i+1][j-1]));
                isPalindrome[j][i] = isPalindrome[i][j];
                
                if (isPalindrome[i][j] && len > longestEnd - longestStart + 1) {
                    longestStart = i;
                    longestEnd = j;
                }
            }
        }
        
        return s.substring(longestStart, longestEnd+1);
    }
}