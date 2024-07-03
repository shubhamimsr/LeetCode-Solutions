class Solution {
    public int differenceOfSum(int[] nums) {
        int mainSum = 0;
        int digitsSum = 0;
        for(int n:nums){
            mainSum = mainSum + n;
            digitsSum = digitsSum + sumOfDigits(n);
        }
        return Math.abs(mainSum - digitsSum);
        
    }
    
    public int sumOfDigits(int singleDigitNumber){
        int tempSum = 0;
        while(singleDigitNumber > 0){
            tempSum = tempSum + singleDigitNumber%10;
            singleDigitNumber /= 10;
        }
        return tempSum;
    }
}