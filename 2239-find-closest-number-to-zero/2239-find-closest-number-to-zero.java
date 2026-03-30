class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int n : nums) {
            if (Math.abs(n) < Math.abs(closest)) {
                closest = n;
            } else if (Math.abs(n) == Math.abs(closest) && n > closest) {
                closest = n;
            }
        }
        return closest;
    }
}