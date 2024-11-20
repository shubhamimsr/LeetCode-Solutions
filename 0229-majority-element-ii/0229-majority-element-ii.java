class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = map.keySet();
        for(int n: set){
            if(map.get(n) > len/3){
                list.add(n);
            }
        }
        return list;
    }
}