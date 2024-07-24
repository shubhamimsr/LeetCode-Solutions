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
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode sumList = new ListNode(0);
ListNode head = sumList;
int c = 0;
while(l1 != null || l2 != null){
if(l1 != null){
    c += l1.val;
    l1 = l1.next;
}
if(l2 != null){
    c += l2.val;
    l2 = l2.next;
}
sumList.next = new ListNode(c%10);
sumList = sumList.next;
c/=10;
}
     if(c == 1){
        sumList.next = new ListNode(1);
    }
return head.next;
}

}