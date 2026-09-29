class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
            return false;
        if ((m + n - 1) % 2 != 0)
            return false;

        Boolean[][][] memo = new Boolean[m][n][m + n];

        return solve(0, 0, m, n, 0, grid, memo);
    }

    private boolean solve(int i, int j, int m, int n, int openCount, char[][] grid, Boolean[][][] memo) {

        openCount += (grid[i][j] == '(') ? 1 : -1;

        if (openCount < 0)
            return false;
        if (i == m - 1 && j == n - 1)
            return openCount == 0;

        if (memo[i][j][openCount] != null)
            return memo[i][j][openCount];

        //down
        if (i + 1 < m) {
            if (solve(i + 1, j, m, n, openCount, grid, memo))
                return memo[i][j][openCount] = true;
        }

        //right
        if (j + 1 < n) {
            if (solve(i, j + 1, m, n, openCount, grid, memo))
                return memo[i][j][openCount] = true;
        }

        return memo[i][j][openCount] = false;
    }
}