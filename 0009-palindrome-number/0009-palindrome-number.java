class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int digit, reverse=0;
        
        while(x>0)
        {
            digit = x%10;
            reverse = reverse * 10 + digit;
            x = x/10;
        }
        
        if(reverse == n){
            return true;
        }else{
            return false;
        }
        
    }
}