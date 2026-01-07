class Solution {
    // public int maxSubArray(int[] nums) {
    //     int sum=0, maxSum=Integer.MIN_VALUE;
    //     int l=0, r=0;
    //     int n = nums.length;

       
    //     while(l < n){
    //          if (r >= n) {
    //         l++;
    //         r = l;
    //         sum = 0;
    //         continue;
    //     }
    //         sum = sum + nums[r];
    //         maxSum = Math.max(maxSum, sum);
    //         r++;
    //     }
    //     return maxSum;
    // }

public int maxSubArray(int[] nums) {
    int sum=nums[0];
    int maxSum=nums[0];

    for(int i=1; i<nums.length; i++){
        sum = Math.max(nums[i], sum+nums[i]);
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
}