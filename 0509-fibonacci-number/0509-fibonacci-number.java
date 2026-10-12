class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        //if n==0 or n==1
        if (n <= 1) {
            return n;
        }
        return solve(n, memo);
    }

    private int solve(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        return memo[n] = solve((n - 1), memo) + solve((n - 2), memo);
    }
}