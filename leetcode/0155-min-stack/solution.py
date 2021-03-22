class MinStack:
    
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = list()
        self.minElement = float(inf)

    def push(self, val: int) -> None:
        self.stack.append(2 * val - self.minElement)
        
        if val < self.minElement:
            self.minElement = val

    def pop(self) -> None:
        top = self.stack.pop()
        
        if top < self.minElement:
            self.minElement = 2 * self.minElement - top

    def top(self) -> int:
        top = self.stack[-1]
        
        if top < self.minElement:
            return self.minElement
        else:
            return (top + self.minElement) // 2

    def getMin(self) -> int:
        return self.minElement


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()