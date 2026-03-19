class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int left=0;
        int right=nums.length-1;

        while(right-left + 1 > k){
            int l=Math.abs(nums[left]-x);
            int r = Math.abs(nums[right]-x);
            if(l>r){
                left++;
            }else{
                right--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            list.add(nums[i]);
        }
        return list;
    }
}


// class Solution {
//     public List<Integer> findClosestElements(int[] nums, int k, int x) {
//         //using MAX_HEAP
//         PriorityQueue<int[]> pq = new PriorityQueue<>(
//                 (a, b) -> {
//                     if (a[0] != b[0]) {
//                         return Integer.compare(b[0], a[0]);
//                     } else {
//                         return Integer.compare(b[1], a[1]);
//                     }
//                 });
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int temp = Math.abs(nums[i] - x);
//             pq.add(new int[] { temp, nums[i] });
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }

//         List<Integer> list = new ArrayList<>();
//         while (!pq.isEmpty()) {
//             list.add(pq.poll()[1]);

//         }
//         Collections.sort(list);
//         return list;
//     }
// }