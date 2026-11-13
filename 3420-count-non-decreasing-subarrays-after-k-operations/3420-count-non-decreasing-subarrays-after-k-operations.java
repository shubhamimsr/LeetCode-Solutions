class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long cost = 0;
        long result = 0;

        Deque<long []> dq = new ArrayDeque<>();

        int j = n-1;
        for(int i=n-1; i>=0; i--){
            long freq = 1;
            while(!dq.isEmpty() && dq.peekLast()[0] < nums[i]){
                long last[] = dq.pollLast();
                cost += (nums[i]-last[0]) * last[1];
                freq += last[1];
            }

            dq.offer(new long[]{nums[i], freq});

            while(cost > k){
                long first[] = dq.peekFirst();
                cost -= (first[0] - nums[j]);
                first[1]--;
                if(first[1] == 0)
                    dq.pollFirst();
                j--;
            }
            result += j-i+1;
        }

        return result;
    }
}