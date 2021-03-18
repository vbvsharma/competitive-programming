# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 == None:
            return l2
        if l2 == None:
            return l1
        
        if l1.val < l2.val:
            merged = self.mergeTwoLists(l1.next, l2)
            l1.next = merged
            return l1
        
        merged = self.mergeTwoLists(l1, l2.next)
        l2.next = merged
        return l2
        