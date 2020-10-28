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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        
        ListNode lead = dummy;
        while (n > 0) {
            lead = lead.next;
            n--;
        }
        
        ListNode lag = dummy;
        while (lead.next != null) {
            lead = lead.next;
            lag = lag.next;
        }
        
        ListNode toBeDeleted = lag.next;
        lag.next = toBeDeleted.next;
        toBeDeleted.next = null;
        
        return dummy.next;
    }
}