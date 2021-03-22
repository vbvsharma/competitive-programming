class MinStack {
public:
    int minElement;
    stack<long long> s;
    
    /** initialize your data structure here. */
    MinStack() {
        minElement = INT_MAX;
    }
    
    void push(int val) {
        s.push(2L * val - minElement);
        
        if (val < minElement) {
            minElement = val;
        }
    }
    
    void pop() {
        long long top = s.top();
        s.pop();
        
        if (top < minElement) {
            minElement = (int)(2L * minElement - top);
        }
    }
    
    int top() {
        long long top = s.top();
        
        if (top < minElement) {
            return minElement;
        } else {
            return (int) ((top + minElement) / 2);
        }
    }
    
    int getMin() {
        return minElement;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */