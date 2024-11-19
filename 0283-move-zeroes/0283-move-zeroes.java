class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int []temp = new int[len];
        int j=0;
        for(int n:nums){
            if(n!=0){
                temp[j] = n;
                j++;
            }
        }
        while(j != len){
            if(len < 1){
                j++;
            }
            temp[j] = 0;
            j++;
        }
        
        for(int i=0; i<len; i++){
            nums[i] = temp[i];
            
        }
    }
}