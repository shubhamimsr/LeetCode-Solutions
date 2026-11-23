class NumArray {
    private final int [] prefixSum;  

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1]; 
        prefixSum[0] = 0;

        for(int i=1; i<=nums.length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i-1];
        }
        // System.out.println(Arrays.toString(prefixSum));
    }
    
    public int sumRange(int left, int right) {
        if(0 > left ||  right > prefixSum.length || left > right)
            return 0;
            
        return prefixSum[right+1] - prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */