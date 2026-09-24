class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int currSum = getDigitSum(nums[i]);

            if (i == currSum) {
                return i;
            }
        }
        return -1;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        return sum;
    }
}