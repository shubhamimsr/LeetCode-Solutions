    class Solution {
        public int maximumProduct(int[] nums) {
            int numLength = nums.length-1;
            Arrays.sort(nums);
            return Math.max(nums[0]*nums[1]*nums[numLength] , nums[numLength]*nums[numLength-1]*nums[numLength-2]);
        }
    }