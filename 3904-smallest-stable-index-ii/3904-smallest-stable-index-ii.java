class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];

        int suffixMin[] = new int[n];

        for(int i=n-1; i>=0; i--){
            suffixMin[i] =Math.min(nums[i], i<(n-1)?suffixMin[i+1]:nums[i]);
        }

        for(int i=0; i<n; i++){
            max = Math.max(nums[i], max);
            if(max-suffixMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}