class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();

        // for(int n:nums){
        //     if(set.contains(n)){
        //         return true;
        //     }
        //     set.add(n);
        // }
        // return false;

        return Arrays.stream(nums)
                    // .boxed()
                    .distinct()
                    .count() != nums.length;

    }
}

/*
set.add all from nums
    int size = size.nums;
    set.stream()
        .

 */