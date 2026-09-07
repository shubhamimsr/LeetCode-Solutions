class Solution {
    public int distinctSubseqII(String s) {

        int MOD = (int) 1e9 + 7;

        long[] dp = new long[26];
        long sum = 0;

        for (char c : s.toCharArray()) {
            long total = (1 + sum) % MOD;
            sum = sum + (total - dp[c - 'a']);

            dp[c - 'a'] = total;
        }
        return (int) (sum % MOD);
    }
}