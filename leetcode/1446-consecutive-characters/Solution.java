class Solution {
    public int maxPower(String s) {
        int max = 1;
        
        int startI = 0;
        while (startI < s.length()) {
            int i = startI+1;
            while (i < s.length() && s.charAt(startI) == s.charAt(i)) {
                i++;
            }
            
            max = Math.max(i - startI, max);
            startI = i;
        }
        return max;
    }
}