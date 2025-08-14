class Solution {
    public String largestGoodInteger(String num) {
        String maxString = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String subString = num.substring(i, i + 3);
                if (maxString.isEmpty() || subString.compareTo(maxString) > 0) {
                    maxString = subString;
                }
            }
        }

        
        return maxString;
    }
}