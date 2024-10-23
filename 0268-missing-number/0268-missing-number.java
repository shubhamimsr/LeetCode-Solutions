class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sumOfArray = Arrays.stream(nums).sum(), 
        sumOfIndex = len * (len+1) / 2;
        
        return sumOfIndex - sumOfArray;
    }
}