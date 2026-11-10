class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowServerCounts[] = new int[m];
        int colServerCounts[] = new int[n];

        int result=0;
        //pre-processing
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    rowServerCounts[row]++;
                    colServerCounts[col]++;
                }
            }
        }

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1 && (rowServerCounts[row] > 1 || colServerCounts[col] > 1)) {
                    result++;
                }
            }
        }
        return result;
    }
}