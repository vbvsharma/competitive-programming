class MinStack {
    
    private Stack<Long> stack;
    private long minElement;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minElement = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        stack.add(2L * x - minElement);
	    if (x < minElement)
	        minElement = x;
    }
    
    public void pop() {
	    long p = stack.peek();
	    stack.pop();
	    
        if (p < minElement)
            minElement = 2 * minElement - p;
    }
    
    public int top() {
        long p = stack.peek();
	    
	    if (minElement <= p) {
	        return (int)((p + minElement) / 2);
        } else {
            long prevMinElement = 2 * minElement - p;
            return (int)((p + prevMinElement) / 2);
        }
    }
    
    public int getMin() {
        return (int)minElement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */