class Solution {
    public void sortColors(int[] nums) {
        int left=0,
        right=nums.length-1,
        i=0;
        
        while(i <= right){
            if(nums[i] == 0){
                swap(nums, left++, i++);
            }else if(nums[i] == 2){
                swap(nums, right-- , i);
            }else{
                i++;
            }
        }
    }
    
    
    public void swap(int []nums, int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}