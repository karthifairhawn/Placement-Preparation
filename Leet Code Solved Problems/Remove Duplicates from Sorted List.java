// 83. Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Input: head = [1,1,2]
// Output: [1,2]

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode original = head;
        ListNode dup = head.next;
        
        while(dup.next!=null){            
            while(original.val==dup.val && dup.next!=null){
                dup=dup.next;
            }
            if(dup.val==original.val){
                original.next=null;
                break;
            }
            original.next=dup;
            original=original.next;
            if(dup.next!=null) dup=dup.next;
        }
        if(dup.val==original.val){
            original.next=null;
        }
            
        return head;
    }
}