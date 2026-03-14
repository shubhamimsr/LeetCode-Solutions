class MinStack {
    private Stack<Long> stack;
    long minElement;

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push((long)val);
            minElement = val;
        } else {
            if (val >= minElement) {
                stack.push((long)val);
            } else if (val < minElement) {
                stack.push(2L * val - minElement);
                minElement=val;
            }
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }else{
            if(stack.peek() >= minElement){
                stack.pop();
            }else if(stack.peek() < minElement){
                minElement = 2L*minElement - stack.peek();
                stack.pop();
            }
        }
    }

    public int top() {
        long top = stack.peek();
        if (stack.isEmpty()) {
            return -1;
        } else {
            if (top >= minElement) {
                return (int)top;
            } else if (top < minElement) {
                return (int)minElement;
            }
        }
        return -1;
    }

    public int getMin() {
        if(stack.isEmpty())
            return -1;
        return (int)minElement;
    }
}
// class MinStack {

//     private Stack<Integer> stack;
//     private Stack<Integer> ss;

//     public MinStack() {
//         this.stack = new Stack<>();
//         this.ss = new Stack<>();
//     }

//     public void push(int val) {
//         stack.push(val);
//         if(ss.isEmpty() || val <= ss.peek()){
//             ss.push(val);
//         }
//         return;
//     }

//     public void pop() {
//         if(stack.isEmpty()){
//             return;
//         }
//         int ans = stack.peek();
//         stack.pop();
//         if(ss.peek() == ans){
//             ss.pop();
//         }
//         return;
//     }

//     public int top() {
//         if(stack.isEmpty()){
//             return -1;
//         }
//         return stack.peek();
//     }

//     public int getMin() {
//         if (ss.isEmpty()) {
//             return -1;
//         }
//         return ss.peek();
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */