class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[401];
        Arrays.fill(memo, -1);
        return solve(0, nums, memo);
    }

    private int solve(int i, int[] nums, int memo[]) {
        if (i == nums.length) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }

        int steal = 0, skip = 0;
        if (i < nums.length) {
            steal = nums[i] + solve(i + 2, nums,memo);
            skip = solve(i + 1, nums,memo);
        }
        return memo[i] = Math.max(steal, skip);
    }
}