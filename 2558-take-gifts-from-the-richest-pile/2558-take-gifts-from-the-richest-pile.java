class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        while (k > 0 && !maxHeap.isEmpty()) {
            int temp = maxHeap.poll(); 
            int rootValue = (int) Math.sqrt(temp); 
            maxHeap.add(rootValue); 
            k--;
        }

        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}