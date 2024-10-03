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
    public int getDecimalValue(ListNode head) {
        ListNode dummy = head;
        StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }
        String binaryString = sb.toString();
        int intVal = Integer.parseInt(binaryString, 2);
        return intVal;
    }
}