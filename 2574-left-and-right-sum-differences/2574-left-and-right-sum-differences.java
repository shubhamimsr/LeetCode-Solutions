class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for(int num : nums) rightSum += num;
        for(int i = 0; i < n; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            nums[i] = Math.abs((leftSum - nums[i]) - rightSum);
        }
        return nums;
    }
}