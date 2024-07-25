class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        // int minIndex = 0;
        // int temp = 0;
        // for(int i=0; i < nums.length-1; i++){
        //     minIndex = i;
        //     for(int j=i+1; j < nums.length; j++){
        //         if(nums[minIndex] > nums[j]){
        //             minIndex = j;
        //         }
        //     }
        //     temp = nums[minIndex];
        //     nums[minIndex] = nums[i];
        //     nums[i] = temp;
        // }
        return nums;
    }
}