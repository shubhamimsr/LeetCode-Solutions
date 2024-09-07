class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        
        for(int n:nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        
        for(int n:set){
            return n;
        }
        return -1;
    }
}