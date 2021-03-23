class Solution:
    def isValid(self, s: str) -> bool:
        stack = list()
        
        i = 0
        while i < len(s):
            if s[i] == '(':
                stack.append(')')
            elif s[i] == '{':
                stack.append('}')
            elif s[i] == '[':
                stack.append(']')
            elif len(stack) == 0 or stack[-1] != s[i]:
                return False
            else:
                stack.pop()
            
            i += 1
        
        return len(stack) == 0