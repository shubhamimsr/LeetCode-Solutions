class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;
        
        List<Integer> lst = new ArrayList<Integer>();
        
        while(top <= bottom && left <= right){
        for(int i=left; i<=right; i++)
        {
            lst.add(matrix[top][i]);
        }
        top++;
        
        for(int j=top; j<=bottom; j++)
        {
            lst.add(matrix[j][right]);
        }
        right--;
        
        if(top <= bottom){
            for(int i=right; i>= left; i--)
            {
                lst.add(matrix[bottom][i]);
            }
            bottom--;
        }
        
        if(left <= right){
            for(int j=bottom; j >= top; j--){
                lst.add(matrix[j][left]);
            }
        left++;
        }
        }
        return lst;
    }
}