class Solution{
    public int[] buildArray(int [] nums){
        permutations(nums, 0);
        return nums;
    }

    void permutations(int [] nums, int start){
        if(start < nums.length){
            int temp = nums[start];
            int result = nums[temp];
            permutations(nums, start+1);
            nums[start] = result;
        }
    }
}
// class Solution {
//     public int[] buildArray(int[] nums) {
//         int resultArray[] = new int[nums.length];

//         for(int i=0; i<nums.length; i++){
//             resultArray[i] = nums[nums[i]];
//         }
//         return resultArray;
//     }
// }