class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(')
                stack.add(')');
            else if (ch == '{')
                stack.add('}');
            else if (ch == '[')
                stack.add(']');
            else if (stack.empty())
                return false;
            else if (ch == stack.peek())
                stack.pop();
            else
                return false;
        }
        
        return stack.empty();
    }
}