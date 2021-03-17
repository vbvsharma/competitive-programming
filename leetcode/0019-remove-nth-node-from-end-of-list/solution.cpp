/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* aheadPtr = head;
        n--;
        while (n > 0) {
            aheadPtr = aheadPtr->next;
            n--;
        }
        
        if (aheadPtr->next == nullptr) {
            ListNode* newHead = head->next;
            delete head;
            return newHead;
        }
        
        ListNode* behindPtr = head;
        ListNode* prevPtr = nullptr;
        while (aheadPtr->next != nullptr) {
            prevPtr = behindPtr;
            aheadPtr = aheadPtr->next;
            behindPtr = behindPtr->next;
        }
        
        prevPtr->next = behindPtr->next;
        
        delete behindPtr;
        
        return head;
    }
};