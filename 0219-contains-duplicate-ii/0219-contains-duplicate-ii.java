class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer n = map.put(nums[i],i);
            if(n != null && (i-n)<=k){
                return true;
            }
        }
        return false;
    }
}