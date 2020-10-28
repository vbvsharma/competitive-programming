class Solution {
    public String countAndSay(int n) {        
        if (n == 1)
            return "1";
        
        StringBuilder prev = new StringBuilder("1");
        
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            
            int j = 0;
            while (j < prev.length()) {
                int k = j+1;
                char ch = prev.charAt(j);
                while (k < prev.length() && ch == prev.charAt(k))
                    k++;
                
                next.append(k-j).append(ch);
                j = k;
            }
            
            prev = next;
        }
        
        return prev.toString();
    }
}