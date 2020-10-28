class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int len = 1; len <= s.length() / 2; len++) {
            if (s.length() % len != 0)
                continue;
            
            boolean repeated = true;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i%len)) {
                    repeated = false;
                    break;
                }
            }
            
            if (repeated)
                return repeated;
        }
        
        return false;
    }
}