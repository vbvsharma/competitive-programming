/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode *rev = NULL, *fast = head, *slow = head;
        
        while (fast && fast->next) {
            fast = fast->next->next;
            ListNode* next = slow->next;
            slow->next = rev;
            rev = slow;
            slow = next;
        }
        
        if (fast)
            slow = slow->next;
        
        while (rev) {
            if (rev->val != slow->val)
                return false;
            rev = rev->next;
            slow = slow->next;
        }
        
        return true;
    }
};