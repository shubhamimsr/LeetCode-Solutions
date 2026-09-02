class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int nums1Sum = getSum(nums1);
        if (nums1Sum % 2 == 0) {
            return true;
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0 && i != n - 1) {
                nums2[i] = nums1[i] - nums1[i + 1];
            } else if (nums1[i] % 2 == 0 && i == n - 1) {
                nums2[i] = nums1[i] - nums1[i - 1];
            } else {
                nums2[i] = nums1[i];
            }
            // sum+=nums2[i];
        }
        int nums2Sum = getSum(nums2);
        if (nums2Sum % 2 == 0 || nums2Sum % 2 != 0) {
            return true;
        }
        return false;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}