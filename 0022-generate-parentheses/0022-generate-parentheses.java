class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        solve(sb, n, 0, 0, result);
        return result;
    }

    private void solve(StringBuilder sb, int n, int open, int close, List<String> result) {
        if ((sb.length() == 2 * n) && isValid(sb.toString())) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append('(');
            solve(sb, n, open + 1, close, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < n) {
            sb.append(')');
            solve(sb, n, open, close + 1, result);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    private boolean isValid(String s) {
        int d = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') 
                d++;
             else if (c == ')' || c == '}' || c == ']') 
                d--;
            

            if (d < 0)
                return false;
        }
        return d == 0;
    }





    
    // private boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<>();

    //     for (char c : s.toCharArray()) {
    //         if (c == '(' || c == '{' || c == '[') {
    //             stack.push(c);
    //         } else if ((!stack.isEmpty() && stack.peek() == '(' && c == ')') ||
    //                 (!stack.isEmpty() && stack.peek() == '{' && c == '}') ||
    //                 (!stack.isEmpty() && stack.peek() == '[' && c == ']')) {
    //             stack.pop();
    //         }
    //     }
    //     return stack.isEmpty();
    // }
}