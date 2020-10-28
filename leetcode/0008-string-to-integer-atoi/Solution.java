class Solution {
    public int myAtoi(String str) {
        int num = 0;
        str = str.trim();
        
        if (str.length() == 0)
            return 0;
        
        boolean positive = true;
        int i = 0;
        if (str.charAt(i) == '-') {
            positive = false;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        } else if (!Character.isDigit(str.charAt(i))) {
            return 0;
        }
        
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && (str.charAt(i) - '0') > 7))
                return Integer.MAX_VALUE;
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && (str.charAt(i) - '0') > 8))
                return Integer.MIN_VALUE;
            
            num = num * 10 + (str.charAt(i) - '0') * (positive ? 1 : -1);
            
            i++;
        }
        
        return num;
    }
}