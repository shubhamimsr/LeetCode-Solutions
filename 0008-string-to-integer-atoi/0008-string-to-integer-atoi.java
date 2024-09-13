class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        
        int index = 0, sign = 1, result = 0;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') {
                break;
            }

            int digit = c - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}
