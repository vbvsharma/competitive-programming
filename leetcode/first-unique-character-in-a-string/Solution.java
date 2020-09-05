class Solution {
    public int firstUniqChar(String s) {
        int[] index = new int[26];
        Arrays.fill(index, -2);
        
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)-'a'] == -2) {
                index[s.charAt(i)-'a'] = i;
            } else if (index[s.charAt(i)-'a'] == -1) {
                continue;
            } else if (index[s.charAt(i)-'a'] >= 0) {
                index[s.charAt(i)-'a'] = -1;
            }
        }
        
        int minIndex = s.length();
        for (int i = 0; i < index.length; i++) {
            if (index[i] >= 0 && index[i] < minIndex)
                minIndex = index[i];
        }
        
        return minIndex == s.length() ? -1 : minIndex;
    }
}