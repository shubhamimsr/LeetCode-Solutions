class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int m = points[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int dist = x * x + y * y;
            pq.add(new int[] { dist, x, y });
            if (pq.size() > k) {
                pq.poll();
            }

        }

        int[][] result = new int[k][m];
        int idx = 0;
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            result[idx][0] = temp[1];
            result[idx][1] = temp[2];
            idx++;
        }
        return result;
    }
}