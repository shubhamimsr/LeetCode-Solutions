class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        
        int result=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                stack.push(result);
                result=0;
            }else {
                if(s.charAt(i-1) == '('){
                    result = stack.peek()+1;
                }else{
                    result = stack.peek() + 2*result;
                }
                stack.pop();
            }
        }
        return result;
    }
}