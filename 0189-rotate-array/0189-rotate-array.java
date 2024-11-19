class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        int [] temp = new int[len];
        int j=0;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[len - k + i];
        }

        for (int i = k; i < len; i++) {
            temp[i] = nums[i - k];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        
        }
    }
}