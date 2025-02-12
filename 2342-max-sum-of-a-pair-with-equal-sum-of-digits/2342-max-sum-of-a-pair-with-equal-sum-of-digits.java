class Solution {
    public int maximumSum(int[] nums) {
        int maxSum = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            int sum = digitSum(n);
            if (map.containsKey(sum)) {
                maxSum = Math.max(maxSum, map.get(sum)+n);
                map.put(sum, Math.max(map.get(sum), n));
            }else{
                map.put(sum, n);
            }
        }
        return maxSum;
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}

/*
class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[100];
        int ans = -1;
        for(int x : nums){
            int dsum = 0;
            int temp = x;
            while(temp != 0){
                dsum += temp % 10;
                temp /= 10;
            }
            if(max[dsum] != 0) ans = Math.max(ans, x + max[dsum]);
            max[dsum] = Math.max(max[dsum], x);
        }
        return ans;
    }
}
 */