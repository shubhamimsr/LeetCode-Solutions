class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[46];
        Arrays.fill(memo, -1);
        return solve(n, memo);
    }

    private int solve(int n, int[] memo) {
        if (n < 0)
            return 0;
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n == 0)
            return memo[n] = 1;

        int oneStep = solve((n - 1), memo);
        int twoSteps = solve((n - 2), memo);

        return memo[n] = oneStep + twoSteps;
    }
}