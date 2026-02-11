class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        int count=0, maxCount=0;

        while(j<n){
            if(nums[j] == 1){
                count++;
            }else if(nums[j] != 1){
                i=j+1;
                count=0;
            }
            maxCount = Math.max(maxCount,count);
            j++;
        }
        return maxCount;
    }
}