class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int val = (26 - (s.charAt(i) - 'a')) * (i + 1);

            // char c = (char) ('z' - (s.charAt(i) - 'a'));
            // System.out.println(val + "=====>CHAR:" + c);

            result += val;
        }

        return result;
    }
}