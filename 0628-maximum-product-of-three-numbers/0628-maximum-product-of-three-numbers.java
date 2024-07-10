    class Solution {
        public int maximumProduct(int[] nums) {
            int numLength = nums.length;
            Arrays.sort(nums);
            return Math.max(nums[0]*nums[1]*nums[numLength-1] , nums[numLength-1]*nums[numLength-2]*nums[numLength-3]);
        }
    }