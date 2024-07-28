class Solution {
    public boolean isHappy(int n) {
     HashSet<Integer> set = new HashSet<>();
        
        while(n != 0 && !set.contains(n)){
            set.add(n);
            n = squareOfDigits(n);
        }
        if(n == 1){
            return true;
        }
        return false;
    }
    
    public int squareOfDigits(int n){
        int s = 0;
        while(n > 0){
            s = s + (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }
}