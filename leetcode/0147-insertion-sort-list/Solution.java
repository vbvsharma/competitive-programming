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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode dummyNode = new ListNode(0);
        
        while (head != null) {
            ListNode key = head;
            head = head.next;
            key.next = null;
            
            ListNode curr = dummyNode.next;
            ListNode prev = dummyNode;
            while (curr != null && curr.val < key.val) {
                prev = curr;
                curr = curr.next;
            }
            key.next = prev.next;
            prev.next = key;
        }
        
        return dummyNode.next;
    }
}