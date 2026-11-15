class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n = nums.length;
        int result[] = {-1,-1};
        int maxProduct = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i]>nums[j] && nums[i]+nums[j] == target){
                    if(nums[i]*nums[j] > maxProduct ){
                        maxProduct = Math.max(maxProduct, nums[i]*nums[j]);
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
}