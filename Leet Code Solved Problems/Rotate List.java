// 61. Rotate List

// Given the head of a linked list, rotate the list to the right by k places.

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// Input: head = [0,1,2], k = 4
// Output: [2,0,1]

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109

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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k==0) return head;
        
        int size = 0;
        
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        
        if(size==0 || size==1){
            return head;
        }
        
        k = k%size;
        
        if(k==0){
            return head;
        }
        
        int to_find = size-k;
        
        
        ListNode trav = head;
        ListNode second_part = null;
        
        int count=0;
        while(trav!=null){
            count++;            
            if(count==to_find){
                second_part = trav.next;
                trav.next=null;
                break;
            }
            trav = trav.next;
        }

        
        ListNode second_part_trav=second_part;
        while(second_part_trav.next!=null){
            second_part_trav = second_part_trav.next;
        }
        second_part_trav.next = head;
        return second_part;
        
    }
}