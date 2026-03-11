class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> ss;

    public MinStack() {
        this.stack = new Stack<>();
        this.ss = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(ss.isEmpty() || val <= ss.peek()){
            ss.push(val);
        }
        return;
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int ans = stack.peek();
        stack.pop();
        if(ss.peek() == ans){
            ss.pop();
        }
        return;
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (ss.isEmpty()) {
            return -1;
        }
        return ss.peek();
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