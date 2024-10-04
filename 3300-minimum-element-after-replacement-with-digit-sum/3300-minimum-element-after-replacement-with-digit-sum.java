class Solution {
    public int minElement(int[] nums) {
        int min = digitSum(nums[0]);
        // int min = 1;
            for(int i=0; i<nums.length; i++){
                int sum = digitSum(nums[i]);
                nums[i] = sum;
                min = Math.min(min, sum);
            }
        return min;
    }
    
    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
}