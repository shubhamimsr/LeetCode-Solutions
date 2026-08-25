class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (i % k == 0) {
                set.add(i);
            }
        }

        int current = k;
        while(set.contains(current)){
            current += k;
        }
        return current;
    }
}