class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        IntStream.range(0, n)
                .forEach(i -> nums[i] = nums[i] * nums[i]);

        Arrays.sort(nums);
            // Arrays.stream(nums)
            //     .forEach(num-> System.out.print(num+" "));
        long smallSum = Arrays.stream(nums)
                                .limit(n / 2)
                                .asLongStream()
                                .sum();

        long largeSum = Arrays.stream(nums)
                                .skip(n / 2)
                                .asLongStream()
                                .sum();

        return largeSum-smallSum;
    }
}