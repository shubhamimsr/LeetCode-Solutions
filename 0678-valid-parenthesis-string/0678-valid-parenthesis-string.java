class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> astraStack = new Stack<>();

        return solve(0, s, n, openStack, astraStack);
    }

    private boolean solve(int i, String s, int n, Stack<Integer> openStack, Stack<Integer> astraStack) {
        
        if (i == s.length()) { 
            // match remaining '(' with '*' 
            while (!openStack.isEmpty()) {
                if (astraStack.isEmpty()) {
                    return false;
                } 
                
                // '*' must come after '(' 
                if (astraStack.peek() < openStack.peek()) {
                    return false;
                }
                openStack.pop();
                astraStack.pop();
            }
            return true;
        }

        char ch = s.charAt(i);
        if (ch == '(') {
            openStack.push(i);
        } else if (ch == '*') {
            astraStack.push(i);
        } else {
            if (!openStack.isEmpty()) {
                openStack.pop();
            } else if (!astraStack.isEmpty()) {
                astraStack.pop();
            } else {
                return false;
            }
        }
        return solve(i + 1, s,n, openStack, astraStack);
    }
}
// class Solution {
//     public boolean checkValidString(String s) {
//         int n = s.length();
//         Boolean[][] memo = new Boolean[101][101];
//         return solve(0, 0, s, n, memo);
//     }

//     private boolean solve(int i, int open, String s, int n, Boolean[][] memo) {
//         if (i == n) {
//             return open == 0;
//         }

//         if (memo[i][open] != null) {
//             return memo[i][open];
//         }
//         boolean isValid = false;

//         char ch = s.charAt(i);
//         if (ch == '*') {
//             //  *->(
//             isValid |= solve(i + 1, open + 1, s, n, memo);

//             //  *->""
//             isValid |= solve(i + 1, open, s, n, memo);

//             //  *->)
//             if (open < 0) {
//                 isValid |= solve(i + 1, open - 1, s, n, memo);
//             }
//         } else if (ch == '(') {
//             isValid |= solve(i + 1, open + 1, s, n, memo);
//         } else if (open > 0 && ch == ')') {
//             isValid |= solve(i + 1, open - 1, s, n, memo);
//         }
//         return memo[i][open] = isValid;
//     }
// }