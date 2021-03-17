# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        lead = head
        while n > 0:
            lead = lead.next
            n = n - 1
        
        lag = head
        prev = None
        while lead != None:
            lead = lead.next
            prev = lag
            lag = lag.next
        
        if prev == None:
            return head.next
        
        prev.next = lag.next
        lag.next = None
        
        return head