class Solution {
    public boolean isPalindrome(int x) {
        int r=0,n=x;        
        while(x>0){
            int d = x%10;
            r = r * 10 + d;
            x = x/10;
        }
        if(r == n){
            return true;
        }else{
            return false;
        }
    }
}