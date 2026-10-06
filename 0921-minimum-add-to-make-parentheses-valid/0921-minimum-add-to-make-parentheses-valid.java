class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int additionalBrackets = 0;

        for (char c : s.toCharArray()) {
            // open = (c=='(')?open+1:open;
            // close=(c==')')?close+1:close;
            if (c == '(')
                open++;
            else {
                if (open > 0) {
                    open--;
                } else {
                    additionalBrackets++;
                }
            }
        }
        return Math.abs(open + additionalBrackets);
    }
}