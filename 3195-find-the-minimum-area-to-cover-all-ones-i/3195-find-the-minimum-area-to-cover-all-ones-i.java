class Solution {
    public int minimumArea(int[][] grid) {
          int m = grid.length;
        int n = grid[0].length;

        int minRow = m, maxRow = -1;
        int minCol = n, maxCol = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);//2    0   0   0
                    maxRow = Math.max(maxRow, i);//-1   0   1   1
                    minCol = Math.min(minCol, j);//3    1   0   0
                    maxCol = Math.max(maxCol, j);//-1   1   1   2
                }
            }
        }

        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;

        return height * width;
    }
}