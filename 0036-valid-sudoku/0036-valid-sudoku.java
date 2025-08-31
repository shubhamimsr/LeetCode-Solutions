public class Solution {
    public boolean isValidSudoku(char[][] board) {
      
      //for validating rows 
      for(int row=0; row<9; row++){
          Set<Character> rowSet = new HashSet<>();
          for(int col=0; col<9; col++){
              if(board[row][col] == '.'){
                  continue;
              }
              if(rowSet.contains(board[row][col])){
                  return false;
              }
              
              rowSet.add(board[row][col]);
          }
      }
      
      //for validating columns
      for(int col=0; col<9; col++){
          Set<Character> colSet = new HashSet<>();
          for(int row=0; row<9; row++){
              if(board[row][col] == '.'){
                  continue;
              }
              if(colSet.contains(board[row][col])){
                  return false;
              }
              
              colSet.add(board[row][col]);
          }
      }
      
      //for validating (3*3)*9 boxes
      for(int sr=0; sr<9; sr+=3){
          int er=sr+2;
          for(int sc=0; sc<9; sc+=3){
              int ec=sc+2;
              boolean result = traverseBox(board, sr,er,sc,ec);
              if(!result){
                  return false;
              }
          }
      }
      
      
      
      return true;
    }
    
    private static boolean traverseBox(char [][] board, int sr,int er,int sc,int ec){
            Set<Character> boxSet = new HashSet<>();
            for(int i=sr; i<=er; i++){
                for(int j=sc; j<=ec; j++){
                    if(board[i][j] == '.'){
                        continue;
                    }
                    if(boxSet.contains(board[i][j])){
                        return false;
                    }
                    
                    boxSet.add(board[i][j]);
                }  
            }
            return true;
      }
}