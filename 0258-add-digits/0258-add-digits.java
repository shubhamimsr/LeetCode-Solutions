class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = sumOfDigits(num);
        }
        return num;
    }
    
    public int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num = num / 10;
        }
        
        return sum;
    }
}