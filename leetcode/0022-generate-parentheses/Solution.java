class Solution {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> list = new LinkedList<>();
        generateParenthesis(0, 0, n, new StringBuilder(), list);
        return list;
    }
    
    private void generateParenthesis(int open, int close, int n, StringBuilder str, List<String> list) {
        if (str.length() == 2 * n) {
            list.add(str.toString());
            return;
        }
        
        if (open <= n && open > close) {
            generateParenthesis(open, close + 1, n, str.append(')'), list);
            str.deleteCharAt(open+close);
        }
        
        if (open < n) {
            generateParenthesis(open + 1, close, n, str.append('('), list);
            str.deleteCharAt(open+close);
        }
    }
}