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
    public ListNode removeElements(ListNode head, int val) {
        ListNode resultList = new ListNode(-1);
        resultList.next = head;
        ListNode currentNode = resultList;
        while(currentNode.next != null ){
            if(currentNode.next.val == val ){
                currentNode.next = currentNode.next.next;
            }else{
            currentNode = currentNode.next;
            }
            
        }
        return resultList.next;
    }
}