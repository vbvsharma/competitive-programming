class Solution {
    private int nextAlphaNum(String s, int i) {
        while (i < s.length() && !Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)))
            i++;
        
        return i;
    }
    
    private int prevAlphaNum(String s, int i) {
        while (i >= 0 && !Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)))
            i--;
        
        return i;
    }
    
    public boolean isPalindrome(String s) {
        
        int left = nextAlphaNum(s, 0), right = prevAlphaNum(s, s.length()-1);
        
        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left = nextAlphaNum(s, left+1);
            right = prevAlphaNum(s, right-1);
        }
        
        return true;
    }
}