class Solution {
    public int maximumDifference(int[] nums) {
       int prev = nums[0];
        int maxDiff = -1;
       for(int i=1; i<nums.length; i++){
        if(nums[i] > prev){
            maxDiff = Math.max(maxDiff, nums[i] - prev);
        }else{
            prev = nums[i];
        }
       }
       return maxDiff;
    }
}