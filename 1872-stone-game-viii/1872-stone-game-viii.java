class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int [] prefixSum = new int[n];
        prefixSum[0] = stones[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + stones[i];
        }

        int result = prefixSum[n-1];

        for(int i=n-2; i>=1; i--){
            result = Math.max(result,prefixSum[i]-result);
        }
        return result;
    }
}