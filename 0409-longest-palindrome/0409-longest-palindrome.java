class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                result += 2;
            } else {
                set.add(s.charAt(i));
            }
        }
        // System.out.println(result);
        if (!set.isEmpty()) {
            result += 1;
        }
        return result;
    }
}