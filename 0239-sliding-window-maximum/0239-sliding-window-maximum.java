class Solution {

    public int[] maxSlidingWindow(int nums[], int k){
        int n = nums.length;
        int []result = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        int index=0;

        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
            if(i >= k-1){
                result[index++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
    // public int[] maxSlidingWindow(int[] nums, int k) {
    //     List<Integer> resultArrayList = new ArrayList<>();

    //     int i = 0, j = 0, n = nums.length;
    //     int maxNum = nums[0];
    //     while (j < n) {
    //         if(j-i+1 < k){
    //         maxNum = Math.max(maxNum, nums[j]);

    //         }else 
    //         if (j - i + 1 == k) {
    //             maxNum = Math.max(maxNum, nums[j]);
    //             i++;
    //             resultArrayList.add(maxNum);
    //         }
    //         j++;
    //     }
    //     int[] arr = new int[resultArrayList.size()];
    //     for (int index = 0; index < resultArrayList.size(); index++) {
    //         arr[index] = resultArrayList.get(index);
    //     }
    //     return arr;
    // }
}