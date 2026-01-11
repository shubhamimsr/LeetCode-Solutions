class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        double sum = 0;
        double maxSum = nums[0];

        while(j < n){
            sum = sum + nums[j]; 
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
            // sum = sum + nums[j];
                maxSum = Math.max(maxSum,sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return maxSum / k;
    }
}