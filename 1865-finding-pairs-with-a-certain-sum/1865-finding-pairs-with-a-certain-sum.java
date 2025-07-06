class FindSumPairs {
    private int[] vec1;
    private int vec2[];
    private Map<Integer, Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.vec1 = nums1;
        this.vec2 = nums2;
        this.map = new HashMap<>();
        for (int n : vec2) {
            this.map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }

    public void add(int index, int val) {
        map.put(vec2[index], map.get(vec2[index]) - 1);
        vec2[index] += val;
        map.put(vec2[index], map.getOrDefault(vec2[index], 0) + 1);
    }

    public int count(int total) {
        int resultCount = 0;
        for (int i = 0; i < vec1.length; i++) {
            int diff = total - vec1[i];
            if (map.containsKey(diff)) {
                resultCount += map.get(diff);
            }
        }
        return resultCount;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */