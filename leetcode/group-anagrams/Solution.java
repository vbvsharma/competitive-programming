class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        
        for (String str: strs) {
            char[] charList = str.toCharArray();
            Arrays.sort(charList);
            
            String key = new String(charList);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(str);
        }
        
        return new ArrayList<>(ans.values());
    }
}