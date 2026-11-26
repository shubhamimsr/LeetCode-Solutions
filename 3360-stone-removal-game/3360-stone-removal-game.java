class Solution {
    public boolean canAliceWin(int n) {
        int stonesUsed = 10;

        if(n < stonesUsed)
            return false;

        while(n >= stonesUsed){
            n -= stonesUsed;
            stonesUsed--;
        }
        return stonesUsed % 2 != 0 ;
    }
}

/*
if odd Alice->wins
else   Bob->wins
 */