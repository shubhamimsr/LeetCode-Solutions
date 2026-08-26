class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        int i = 0, j = 0;
        int countOf1s = 0;

        String result = "";

        while (j < n) {

            if (s.charAt(j) == '1') {
                countOf1s++;
            }

            while (countOf1s > k) {
                if (s.charAt(i) == '1') {
                    countOf1s--;
                }
                i++;
            }

            while (i <= j && countOf1s == k && s.charAt(i) == '0') {
                i++;
            }

            if (countOf1s == k) {

                String temp = s.substring(i, j + 1);
                if (result.isEmpty()
                        || temp.length() < result.length()
                        || (temp.length() == result.length()
                            && temp.compareTo(result) < 0)) {

                    result = temp;
                }
            }
            j++;
        }
        return result;
    }
}