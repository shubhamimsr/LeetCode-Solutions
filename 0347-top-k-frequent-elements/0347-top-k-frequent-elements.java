class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            int key = entry.getKey();
            int val = entry.getValue();
            pq.add(new int[] { val, key });
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] = pq.poll()[1];
        }
        return resultArray;
    }
}