class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int i = 0, j = pref.length();

        for (String word : words) {
            if (word.length() >= j) {
                String str = word.substring(0, j);
                // System.out.print(str+", ");
                if (str.equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}