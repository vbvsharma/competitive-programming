class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        
        String commonPrefix = strs[0];
        
        int sz = 0;
        while (sz < commonPrefix.length()) {
            char ch = commonPrefix.charAt(sz);
            for (int i = 1; i < strs.length; i++) {
                if (sz >= strs[i].length() || ch != strs[i].charAt(sz))
                    return commonPrefix.substring(0, sz);
            }
            sz++;
        }
        
        return commonPrefix.substring(0,sz);
    }
}