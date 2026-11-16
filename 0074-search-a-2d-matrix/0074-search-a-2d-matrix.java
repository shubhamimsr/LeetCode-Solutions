class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end  = m*n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            int val = matrix[mid/n][mid%n]; 

            if(val == target){
                return true;
            } 
            if(val < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         int i = 0;
//         int j = n;

//         while (i < m && j >= 0) {

//             if (j < n && matrix[i][j] == target) {
//                 return true;
//             }

//             if (j < n && matrix[i][j] < target)
//                 i++;
//             else
//                 j--;

//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         boolean memo[][] = new boolean[m][n];

//         //solve(int i, int j, m, n, matrix, target)       => starting from (Top-Right)th element of grid 
//         return solve(0, (n-1), m, n, matrix, target, memo);
//     }

//     private boolean solve(int i, int j, int m, int n, int matrix[][], int target, boolean memo[][]) {
//         if(i>=m || j==0 || j<n){
//             return memo[i][j] = false;
//         }

//         if(memo[i][j] != false){
//             return memo[i][j];
//         }

//         if ((j < n) && (matrix[i][j] == target)) {
//             return memo[i][j] = true;
//         }

//         if (matrix[i][j] > target) {                                         //move left
//             return memo[i][j] = solve(i, j-1, m, n, matrix, target, memo);
//         } else if (matrix[i][j] < target) {                                  //move down
//             return memo[i][j] = solve(i+1, j, m, n, matrix, target, memo);
//         }

//         return false;
//     }
// }