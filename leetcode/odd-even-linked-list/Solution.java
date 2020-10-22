class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode oddTail = head;
        ListNode evenTail = head.next;
        ListNode curr = head.next.next;
        evenTail.next = null;
        int nodePosition = 3;
        while (curr != null) {
            ListNode next = curr.next;
            if (nodePosition % 2 == 1) {
                curr.next = oddTail.next;
                oddTail.next = curr;
                oddTail = curr;
            } else {
                evenTail.next = curr;
                curr.next = null;
                evenTail = curr;
            }
            
            curr = next;
            nodePosition++;
        }
        
        return head;
    }
}