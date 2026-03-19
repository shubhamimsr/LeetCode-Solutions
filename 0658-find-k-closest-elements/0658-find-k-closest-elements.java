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

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while(left < right) {
            int mid = left + (right - left)/ 2;
            if(x - arr[mid] > arr[mid+k] - x) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        List<Integer> ans = new ArrayList();
        for(int i = left; i < left+k; i++) ans.add(arr[i]);
        return ans;
    }
}