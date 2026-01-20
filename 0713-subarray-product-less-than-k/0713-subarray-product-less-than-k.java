class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int result = 0;
        int product = 1;

        while (i < n) {
            while (j < n) {
                product *= nums[j];

                if (product < k) {
                    result++;
                } else {
                    break;
                }

                j++;
            }
            i++;
            j = i;
            product = 1;
        }
        return result;
    }
}