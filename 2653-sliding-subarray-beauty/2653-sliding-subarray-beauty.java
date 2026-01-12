class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int freq[] = new int[51];
        
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] < 0) {
                freq[-nums[j]]++;
            }

            if (j - i + 1 == k) {
                result[i] = getXthSmallestNegative(freq, x);

                if (nums[i] < 0) {
                    freq[-nums[i]]--;
                }
                i++;
            }
        }
        return result;
    }

    private int getXthSmallestNegative(int[] freq, int x) {
        for (int i = 50; i >= 1; i--) {
            x = x - freq[i];
            if (x <= 0) {
                return -i;
            }
        }
        return 0;
    }
}