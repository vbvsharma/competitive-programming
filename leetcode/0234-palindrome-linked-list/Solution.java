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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        int len = getLength(head);
        
        ListNode lead = head;
        
        len = (len + 1) / 2;
        while (len-- > 0) {
            lead = lead.next;
        }

        ListNode lag = head;
        ListNode reversedLead = reverse(lead);
        while (reversedLead != null) {
            if (reversedLead.val != lag.val)
                return false;

            reversedLead = reversedLead.next;
            lag = lag.next;
        }
        
        return true;
    }
    
    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }
    
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}