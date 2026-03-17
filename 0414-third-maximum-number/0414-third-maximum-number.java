import java.util.*;

public class Solution {
    public static int thirdMax(int[] nums) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            // ensure distinct elements
            if (set.contains(num)) 
                continue;

            set.add(num);
            minHeap.offer(num);

            // keep only 3 largest elements
            if (minHeap.size() > 3) {
                minHeap.poll(); // remove smallest
            }
        }

        // if less than 3 distinct → return max
        if (minHeap.size() < 3) {
            while (minHeap.size() > 1) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

}