class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->{
                if(a[0] != b[0]){
                    return a[0]-b[0];
                }
                return b[1]-a[1];
            }
        );

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            // System.out.println(e.getKey()+" "+e.getValue());
            pq.add(new int[] { (int) e.getValue(), (int) e.getKey() });
        }
        // boolean hasDupeValues = new HashSet<>(map.values()).size() != map.size();
        // System.out.println(hasDupeValues);
        int[] result = new int[nums.length];
        int idx = 0;
        while (!pq.isEmpty()) {
            int top[] = pq.poll();

            int freq = top[0];
            int num = top[1];
            for (int i = 0; i < freq; i++) {
                result[idx++] = num;
            }
        }

        return result;
    }
}