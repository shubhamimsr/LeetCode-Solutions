class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            map.put(sum, i);
        }

        if (sum < x) {
            return map.get(0);
        }
        int lengthOfLongestSubArray = Integer.MIN_VALUE;
        int remainSum = sum - x;

        sum = 0;
        for (int i = 0; i < n; i++) {

            sum += nums[i];
            int findSum = sum - remainSum;

            if (map.containsKey(findSum)) {
                int idx = map.get(findSum);
                int length = i - idx;
                lengthOfLongestSubArray = Math.max(lengthOfLongestSubArray, length);
            }
        }

        return lengthOfLongestSubArray != Integer.MIN_VALUE ? (n - lengthOfLongestSubArray) : -1;
    }
}