class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
    int maxDiagonalLength = 0;
    int maxArea = 0;


    for(int [] dim: dimensions){
        int length = dim[0];
        int width = dim[1];

        int diagonalSquare = length*length + width*width;
        int area = length * width;

        if(diagonalSquare > maxDiagonalLength){
            maxDiagonalLength = diagonalSquare;
            maxArea = area;
        }else if(diagonalSquare == maxDiagonalLength){
            maxArea = Math.max(maxArea, area);
        }
    }
    return maxArea;
    }
}
