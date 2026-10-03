class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int result = 0;

        //Traversing from L->R
        int open = 0;
        int close = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                open++;
            else
                close++;

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (open < close) {
                close = 0;
                open = 0;
            }
        }

        // Traversing from R->L
        open = 0;
        close = 0;

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')')
                close++;
            else
                open++;

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (close < open) {
                open = 0;
                close = 0;
            }
        }
        return result;
    }
}

// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(-1);
//         int counter = 0;
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(ch == '('){
//                 stack.push(i);
//             }else if(ch == ')'){
//                 stack.pop();
//                 if(stack.isEmpty()){
//                     stack.push(i);
//                 }else{
//                     counter = Math.max(counter, i-stack.peek());
//                 }
//             }
//         }
//         return counter;
//     }
// }