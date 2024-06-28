import java.math.BigInteger;

class Solution {
    public int reverse(int x) {
     
        BigInteger digit,reverse = BigInteger.ZERO;
        boolean isNegative = x<0 ? true:false;
        
        if(isNegative){
            x = x * (-1);
        }
        while(x > 0){
            digit = BigInteger.valueOf(x%10);
            reverse = reverse.multiply(BigInteger.TEN).add(digit);
            x = x / 10;
        }
        
        if(isNegative){
            reverse = reverse.negate();
        }
        
        if(reverse.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 || reverse.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0){
            return 0;
        }
        else{
            return reverse.intValue();
        }
    }
}