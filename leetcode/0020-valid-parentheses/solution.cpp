class Solution {
public:
    bool isValid(string s) {
        stack<char> stac;
        int i = 0;
        while (i < s.size()) {
            if (s[i] == '(') {
                stac.push(')');
            } else if (s[i] == '{') {
                stac.push('}');
            } else if (s[i] == '[') {
                stac.push(']');
            } else if (stac.empty() || stac.top() != s[i]) {
                return false;
            } else {
                stac.pop();
            }
            
            i++;
        }
        
        return stac.empty();
    }
};