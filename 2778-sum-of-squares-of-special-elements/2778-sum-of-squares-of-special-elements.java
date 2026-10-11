class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += (n%i == 0) ? (nums[i-1]*nums[i-1]) : 0;
        }
        return sum;
    }
}