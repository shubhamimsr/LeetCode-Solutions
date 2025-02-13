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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        
        ListNode result = null;
        while(!stack.isEmpty() || carry >0){
            int sum = (stack.isEmpty()?0 : stack.pop())*2 +carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum%10);
            newNode.next = result;
            result = newNode;
        }
   
        return result;
    }
}