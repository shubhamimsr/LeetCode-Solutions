class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        // for (char c : s.toCharArray()) {
        //     if (c == '(') {
        //         if (count != 0)
        //             sb.append(c);
        //         count++;
        //     } else {
        //         count--;
        //         if (count != 0)
        //             sb.append(c);
        //     }
        // }
        solve(0, count, s, sb);
        return sb.toString();
    }

    private void solve(int i, int count, String s, StringBuilder sb) {
        if (i == s.length()) {
            return;
        }
        
        char ch = s.charAt(i);
        if (ch == '(') {
            if (count != 0) {
                sb.append(ch);
            }
            count++;

        } else {
            count--;
            if (count != 0) {
                sb.append(ch);
            }
        }
        solve(i + 1, count, s, sb);
    }
}