class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        char [] numbers = str.toCharArray();
        int pSum=0, nSum=0;
        for(int i=0; i<numbers.length;i++){
            int digit = Character.getNumericValue(numbers[i]);
            if(i%2 == 0){
                pSum += digit;
            }else{
                nSum -= digit;
            }
        }
        return pSum+nSum;
        
    }
}