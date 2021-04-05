class CustomStack {
    private int capacity;
    
    private Stack<Integer> stack;
    
    private int[] increment;
    
    public CustomStack(int maxSize) {
        capacity = maxSize;
        stack = new Stack<Integer>();
        increment = new int[maxSize];
    }
    
    public void push(int x) {
        if (stack.size() >= capacity)
            return;
        
        stack.add(x);
    }
    
    public int pop() {
        if (stack.isEmpty())
            return -1;
        
        int sz = stack.size();
        int top = stack.pop() + increment[sz - 1];
        
        if (0 <= sz - 2)
            increment[sz - 2] += increment[sz - 1];
        increment[sz - 1] = 0;
        return top;
    }
    
    public void increment(int k, int val) {
        if (stack.isEmpty())
            return;
        
        if (stack.size() < k)
            increment[stack.size() - 1] += val;
        else
            increment[k - 1] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */