class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (n % 2 != 0)
                return false;

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}