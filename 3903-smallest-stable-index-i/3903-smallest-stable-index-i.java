class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int max = getMax(nums, i);
            int min = getMin(nums, i);

            int diff = max - min;
            if (diff <= k) {
                return i;
            }
        }

        return -1;
    }

    private static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int getMin(int[] arr, int n) {
        int min = arr[n];
        for (int i = n; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}