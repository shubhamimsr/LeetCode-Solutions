class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;  // edge case
        int product = 1, result = 0;
        int i = 0, j=0, n=nums.length;
        while(j < n){
            product *= nums[j];
            while (product >= k && i <= j) {
                product /= nums[i];
                i++;
            }
            result += (j - i + 1);
            j++;
        }
        return result;
    }
}