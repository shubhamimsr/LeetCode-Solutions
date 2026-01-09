class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int product = 1;
        int count = 0;

        while (i < n) {
            while (j < n) {
                product = product * nums[j];

                if (product < k) {
                    count++; 
                } else {
                    break;  
                }

                j++;
            }
            i++;
            j = i;
            product = 1;
        }

        return count;
    }
}
