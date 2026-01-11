class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int i = 0, j = 0;

        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        int count = 0;
        while (j < n) {
            sum += nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                int avg = sum / k;

                if (avg >= threshold) {
                    count++;
                }
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return count;
    }
}