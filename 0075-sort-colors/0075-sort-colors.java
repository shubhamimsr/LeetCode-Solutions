class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> list = new LinkedList<>();
        for(Integer value : nums){
            list.add(value);
        }
        
        System.out.println(list);
    }
}