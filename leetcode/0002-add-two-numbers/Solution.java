/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumhead = null;
        ListNode sumtail = sumhead;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int val1 = curr1 != null ? curr1.val : 0;
            int val2 = curr2 != null ? curr2.val : 0;
            
            int val = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;
            
            if (sumhead == null) {
                sumhead = new ListNode(val);
                sumtail = sumhead;
            } else {
                sumtail.next = new ListNode(val);
                sumtail = sumtail.next;
            }
            
            if (curr1 != null)
                curr1 = curr1.next;
            if (curr2 != null)
                curr2 = curr2.next;
        }
        
        if (carry > 0)
            sumtail.next = new ListNode(carry);
        
        return sumhead;
    }
}