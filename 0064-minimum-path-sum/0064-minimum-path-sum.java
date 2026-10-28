class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int memo[][] = new int[m + 1][n + 1];

            // solve(i, j, m, n, grid, memo)
        return solve(0, 0, m, n, grid, memo);

    }

    private int solve(int i, int j, int m, int n, int[][] grid, int[][] memo) {

        if (i == (m - 1) && j == (n - 1)) {
            return memo[i][j] = grid[i][j];
        }

        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        if (i == m - 1) {           //LAST ROW, can go only right
            return memo[i][j] = grid[i][j] + solve(i, j + 1, m, n, grid, memo);

        } else if (j == n - 1) {    // LAST COL, can go only down
            return memo[i][j] = grid[i][j] + solve(i + 1, j, m, n, grid, memo);

        } else {
            int right = solve(i, j + 1, m, n, grid, memo);
            int down = solve(i + 1, j, m, n, grid, memo);
            
            return memo[i][j] = grid[i][j] + Math.min(right, down);
        }
    }
}