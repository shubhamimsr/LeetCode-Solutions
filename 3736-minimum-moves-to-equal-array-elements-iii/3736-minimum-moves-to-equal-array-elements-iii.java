class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int sum = Arrays.stream(nums)
                        .sum();

        int max = Arrays.stream(nums)
                        .max()
                        .orElseThrow();
        // int moves=0;
        // for(int i=0; i<n; i++){
        //     moves += max - nums[i];
        // }
        return n*max - sum;

    }
}