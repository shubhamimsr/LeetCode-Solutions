class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int suffixMin[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], i != n - 1 ? suffixMin[i + 1] : nums[i]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - suffixMin[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}