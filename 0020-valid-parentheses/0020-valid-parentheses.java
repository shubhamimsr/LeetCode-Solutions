class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        if (n % 2 == 1)
            return false;

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if ((c == ')' && !stack.isEmpty() && stack.peek() == '(')
                    || (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                    || (c == '}' && !stack.isEmpty() && stack.peek() == '{')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}