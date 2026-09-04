class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] minFromIndex = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            // min = Math.min(min, nums[i]);
            minFromIndex[i] = Math.min(nums[i], i<n-1 ? minFromIndex[i+1] : nums[i]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - minFromIndex[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}

//BRUTE FORCE:
// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int max = getMax(nums, i);
//             int min = getMin(nums, i);

//             int diff = max - min;
//             if (diff <= k) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     private static int getMax(int[] arr, int n) {
//         int max = arr[0];
//         for (int i = 0; i < n; i++) {
//             max = Math.max(max, arr[i]);
//         }
//         return max;
//     }

//     private static int getMin(int[] arr, int n) {
//         int min = arr[n];
//         for (int i = n; i < arr.length; i++) {
//             min = Math.min(min, arr[i]);
//         }
//         return min;
//     }
// }