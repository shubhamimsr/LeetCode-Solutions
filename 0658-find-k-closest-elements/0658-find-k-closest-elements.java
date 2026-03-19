class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        //using MAX_HEAP
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] != b[0]) {
                        return Integer.compare(b[0], a[0]);
                    } else {
                        return Integer.compare(b[1], a[1]);
                    }
                });
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int temp = Math.abs(nums[i] - x);
            pq.add(new int[] { temp, nums[i] });
            if (pq.size() > k) {
                pq.poll();
            }
        }

        //trial prints to see what is stored inside heap
        // {
        //     System.out.println("--");
        //     for(int [] arr: pq){
        //         System.out.println(Arrays.toString(arr));
        //     }

        // }

        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll()[1]);

        }
        Collections.sort(list);
        return list;
    }
}