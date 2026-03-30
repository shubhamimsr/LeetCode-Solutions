class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfArray = Arrays.stream(nums).sum(), 
        sumOfIndex = n * (n+1) / 2;
        
        return sumOfIndex - sumOfArray;
    }
}