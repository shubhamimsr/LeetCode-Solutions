class Solution {
    public int countCommas(int n) {
        int getCount = containsComma(n);
        if(getCount < 4)
            return 0;
        
        System.out.println(getCount);
        return n-1000 +1;
    }

    private static int containsComma(int n){
        int count=0;
        while(n!=0){
            int temp = n%10;
            count++;
            n = n/10; 
        }
        return count;
    }
}