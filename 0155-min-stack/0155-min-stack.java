class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    int  min = Integer.MAX_VALUE;

    public MinStack() {
        // minstack.push(0);
        minstack.push(min);
    }
    
    public void push(int value) {
        if(min>=value){
            min = value;
            minstack.push(min);
        }
        stack.push(value);
    }
    
    public void pop() {
        int val = stack.peek();
        if(val==minstack.peek()){
            minstack.pop();
            min = minstack.peek();
        }
        stack.pop();

    }
    
    public int top() {
        int val=stack.peek();
        return val;
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */