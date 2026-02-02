class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length, i=0, j=0;
        double sum=0;
double maxResult=Double.NEGATIVE_INFINITY;
        while(j<n){
            sum+=nums[j];
            if(j-i+1 == k){
                maxResult = Math.max(maxResult,sum);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return maxResult/k;
    }
}