import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer>stack=new Stack<>();
        stack.push(0);

       for(char c:s.toCharArray()){
        if(c=='(')
            stack.push(0);
        else{
            int top=stack.pop();
            int currentTop=stack.pop();

            stack.push(currentTop + Math.max(2*top,1));
        }
       }
       return stack.peek();
    }
}

//TC=O(n), SC=O(1)
// class Solution {
//     public int scoreOfParentheses(String s) {
//         int n=s.length();
//         int result=0;
//         int depth=0;

//         for(int i=0;i<n;i++){
//             if(s.charAt(i) == '('){
//                 depth++;
//             }else{
//                 depth--;
//                 if(s.charAt(i-1) == '('){
//                     result += Math.pow(2,depth);
//                     // result+= (1<<depth);
//                 }
//             }
//         }
//         return result;
//     }
// }

// TC=SC=O(n)
// class Solution {
//     public int scoreOfParentheses(String s) {
//         int n=s.length();
//         Stack<Integer>stack=new Stack<>();
//         stack.push(0);

//         int result=0;
//         for(int i=0;i<n;i++){
//             if(s.charAt(i) == '('){
//                 stack.push(result);
//                 result=0;
//             }else {
//                 if(s.charAt(i-1) == '('){
//                     result = stack.peek()+1;
//                 }else{
//                     result = stack.peek() + 2*result;
//                 }
//                 stack.pop();
//             }
//         }
//         return result;
//     }
// }