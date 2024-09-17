class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        long sum=0,max=0;
        Set<Integer> set = new HashSet<>();
        while(j<nums.length){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            
            set.add(nums[j]);
            sum += nums[j];
            if(j-i+1 == k){
                max = Math.max(max,sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
}