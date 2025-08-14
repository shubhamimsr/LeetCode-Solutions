class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        while(i <= 31){
            if(n == 0){
return false;
            }
            else if(Math.pow(2,i) == n){
                return true;
            }
            i++;
        }
        return false;
    }
}