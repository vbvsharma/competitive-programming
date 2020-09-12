/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        if (head.next == null)
            return head.data;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }

        return slow.data;
    }
}