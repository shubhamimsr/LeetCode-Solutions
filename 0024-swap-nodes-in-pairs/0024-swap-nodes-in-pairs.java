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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyList = new ListNode(0);
        dummyList.next = head;
        ListNode headNode = dummyList;
        
        while(headNode.next != null && headNode.next.next!=null){
           ListNode firstNode = headNode.next;
            ListNode secondNode = headNode.next.next;
            
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            headNode.next = secondNode;
            
            headNode = firstNode;
        }
        return dummyList.next;
    }
}