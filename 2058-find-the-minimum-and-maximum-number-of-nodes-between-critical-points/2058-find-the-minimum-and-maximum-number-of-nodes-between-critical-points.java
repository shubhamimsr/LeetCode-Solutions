/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode current = head;
        ListNode previous = head;
        System.out.println(Integer.MAX_VALUE);
        int firstCritical = -1, lastCritical = -1;
        int idx = 0;
        int minDist = Integer.MAX_VALUE;

        while (current != null && current.next != null) {

            if ((current.val > previous.val) && (current.val > current.next.val) ||
                    (current.val < previous.val) && (current.val < current.next.val)) {

                if (lastCritical == -1) {
                    firstCritical = idx;
                } else {
                    minDist = Math.min(minDist, idx - lastCritical);
                }
                lastCritical = idx;
            }

            previous = current;
            current = current.next;
            idx++;
        }

        int maxDist = lastCritical - firstCritical;

        if (minDist == Integer.MAX_VALUE && maxDist == 0) {
            return new int[] { -1, -1 };
        }
        return new int[] { minDist, maxDist };
    }
}