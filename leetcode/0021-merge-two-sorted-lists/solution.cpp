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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if (l1 == nullptr)
            return l2;
        if (l2 == nullptr)
            return l1;
        
        if (l1->val < l2->val) {
            ListNode *mergedList = mergeTwoLists(l1->next, l2);
            l1->next = mergedList;
            return l1;
        }
        
        ListNode *mergedList = mergeTwoLists(l1, l2->next);
        l2->next = mergedList;
        return l2;
    }
};