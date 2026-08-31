class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minElementIdx = IntStream.range(0, n)
                .boxed()
                .min((i, j) -> Integer.compare(nums[i], nums[j]))
                .orElse(-1);

        int maxElementIdx = IntStream.range(0, n)
                .boxed()
                .max((i, j) -> Integer.compare(nums[i], nums[j]))
                .orElse(-1);

        int left = Math.min(minElementIdx, maxElementIdx);
        int right = Math.max(minElementIdx, maxElementIdx);

        System.out.println(minElementIdx + " " + maxElementIdx);

        return Math.min((left + 1) + (n - right),
                Math.min(right + 1, n - left));
    }
}