class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();

        int prefixSum[] = new int[n+1]; 
        prefixSum[0] = nums.get(0);
        int minSum=Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            prefixSum[i+1] = prefixSum[i] + nums.get(i);
        }
        // for(int s:prefixSum){
        //     System.out.print(s+" ");
        // }

        for(int i=0; i<n; i++){
            for(int j=l; j<=r; j++){
                int end = i+j-1;
                if(end >= n){
                    break;
                }

                int sum = prefixSum[end+1] - prefixSum[i];
                if(sum>0){
                    minSum = Math.min(minSum, sum);
                }
                
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}