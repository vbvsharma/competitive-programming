class MinStack {
    
    private int minElement;
    private Stack<Long> stack;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        minElement = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.add(2L * val - minElement);
        
        if (val < minElement) {
            minElement = val;
        }
    }
    
    public void pop() {
        long top = stack.pop();
        
        if (top < minElement) {
            minElement = (int)(2 * minElement - top);
        }
    }
    
    public int top() {
        long top = stack.peek();
        
        if (top < minElement) {
            return minElement;
        } else {
            return (int) ((top + minElement) / 2);
        }
    }
    
    public int getMin() {
        return minElement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */