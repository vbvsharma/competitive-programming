class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        
        int maxLength = 0, runningLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer lastIndex = lastIndexMap.get(ch);
            
            if (lastIndex == null)
                runningLength++;
            else
                runningLength = lastIndex < i - runningLength ? runningLength+1 : i - lastIndex;
            
            lastIndexMap.put(ch, i);
            
            maxLength = Math.max(maxLength, runningLength);
        }
        
        return maxLength;
    }
}