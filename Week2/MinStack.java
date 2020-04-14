class MinStack {
    
    Stack<Integer> s;
    int minElement;

    /** initialize your data structure here. */
    public MinStack() {
        s =  new Stack<>();
        minElement=Integer.MAX_VALUE;
        
    }
    
    public void push(int x) {
        if(x<=minElement){
            s.push(minElement);
            minElement = x;
        }
        s.push(x);
    }
    
    public void pop() {
        if(s.pop()==minElement)
            minElement = s.pop();
    }
    
    public int top() {
        
        return s.peek();
    }
    
    public int getMin() {
        return minElement;
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