class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left=0;
        int right=nums.length-1;
int mid=0;
        while(left<right){
            mid = left+(right-left)/2;

            if(nums[mid] ==target){
                return Math.abs(start-mid);
            }else if (nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        return Math.abs(start-mid);
        // int min = Integer.MAX_VALUE;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         min = Math.min(min,Math.abs(start-i));
        //     }
        // }
        // return min;
    }
}