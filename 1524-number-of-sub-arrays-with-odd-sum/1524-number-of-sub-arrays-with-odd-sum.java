class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        final int MOD = 1_000_000_007;

        int sum = 0;
        int even = 1;
        int odd = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum % 2 == 1) {
                result = (result + even) % MOD;
                odd++;
            } else {
                result = (result + odd) % MOD;
                even++;
            }
        }
        return result;
    }
}