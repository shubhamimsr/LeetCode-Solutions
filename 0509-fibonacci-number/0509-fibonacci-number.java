class Solution {
    public int fib(int n) {
        int [] arr = new int[n+1];
        int first = 0, second = 1, sum = 0;
        
        
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        arr[0] = first;
        arr[1] = second;
        for(int i=0; i<n; i++){
            sum = first + second;
            arr[i+1] = sum;
            first = second;
            second = sum;
        }
        return arr[n-1];
    }
}