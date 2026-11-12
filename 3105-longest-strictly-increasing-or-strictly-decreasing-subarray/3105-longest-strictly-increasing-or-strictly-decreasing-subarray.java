class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        int incCount = 1;
        int decCount = 1;

        for(int i=1; i<n; i++){
            if(nums[i] < nums[i-1]){
                maxLen = Math.max(maxLen, ++decCount);
            }else{
                decCount = 1;
            }

            if(nums[i] > nums[i-1]){
                maxLen = Math.max(maxLen, ++incCount);
            }else{
                incCount = 1;
            }
        }

        return maxLen;
    }
}