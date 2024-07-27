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
    public ListNode deleteDuplicates(ListNode head) {
       int temp = 0;
        ListNode headNode = head;
        while(head != null && head.next != null){
            temp = head.val;
            if(head.next.val == temp){
                
                head.next = head.next.next;
                // return head;
            }else{
                head = head.next;
            }
        }
        return headNode;
    }
}

