class Solution {
    public int tribonacci(int n) {
        int [] arr = new int[n+1];
        int first = 0, second = 1, third = 1;
        if(n == 0)return 0;
        if(n == 1 || n == 2)return 1;
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;
        
        int sum=0;
        for(int i=3; i<=n; i++){
            sum = arr[i-1] + arr[i-2] + arr[i-3];
            arr[i] = sum;
            first = second;
            second = third;
            third = sum;
        }
        return arr[n];
    }
}