class Solution {
    int mod = 1_000_000_007;
    int[][] memo;

    public int numberOfSets(int n, int k) {
        memo = new int[k + 1][n + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(n, k, 0);
    }

    private int solve(int n, int k, int i) {
        if (k == 0)
            return 1;

        if (k >= n - i)
            return 0;

        if (memo[k][i] != -1)
            return memo[k][i];

        long take = 0;
        for (int j = i + 1; j < n; j++) {
            take = (take + solve(n, k - 1, j)) % mod;
        }
        int skip = solve(n, k, i + 1);

        return memo[k][i] = (int) (take + skip) % mod;
    }
}