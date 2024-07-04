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
    public ListNode mergeNodes(ListNode head) {
        ListNode newNode = new ListNode();
        
        ListNode headNode = newNode;
        int sum = 0;
        
        head = head.next;
        while(head != null){
            if(head.val == 0){
                headNode.next = new ListNode(sum);
                headNode = headNode.next;
                sum = 0;
            }
            else{
                sum = sum + head.val;
            }
            head = head.next;
        }
        return newNode.next;
        
    }
}