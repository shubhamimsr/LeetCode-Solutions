class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')' && !stack.isEmpty()) {
                if (stack.size() > result) {
                    result = stack.size();
                }
                stack.pop();
            }
        }
        return result;
    }
}