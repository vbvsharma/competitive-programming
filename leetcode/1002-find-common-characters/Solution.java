class Solution {
    public List<String> commonChars(String[] A) {
        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);
        
        for (String a : A) {
            int[] tmp = new int[26];
            
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                tmp[ch - 'a']++;
            }
            
            for (int i = 0; i < 26; i++)
                freq[i] = Math.min(freq[i], tmp[i]);
        }
        
        List<String> answer = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                answer.add((char)('a' + i) + "");
                freq[i]--;
            }
        }
        
        return answer;
    }
}