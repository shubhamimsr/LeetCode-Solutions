class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int sum = Arrays.stream(nums)
                        .sum();
        int min = Arrays.stream(nums)
                        .min()
                        .orElseThrow();

        // for(int i=0; i<n; i++){
                // sum = nums[i] - min;
                // min = Math.min(min,nums[i]);
        // }
        return sum - n*min;   
    }
}