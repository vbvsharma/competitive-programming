class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int answer = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R')
                balance++;
            else
                balance--;
            
            if (balance == 0)
                answer++;
        }
        
        return answer;
    }
}