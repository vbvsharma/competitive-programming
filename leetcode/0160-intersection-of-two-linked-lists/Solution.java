/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode currA = headA, currB = headB;
        
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }
        
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }
        
        if (lenA < lenB)
            return getIntersectionNode(headB, headA);
        
        currA = headA;
        currB = headB;
        int diff = lenA - lenB;

        while (diff != 0) {
            currA = currA.next;
            diff--;
        }
        
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        
        return currA;
    }
}