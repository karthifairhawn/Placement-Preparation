234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome.

Input: head = [1,2,2,1]
Output: true

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

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
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();            
        
        ListNode ptr = head;
        while(ptr!=null){
            s.append(ptr.val);
            ptr = ptr.next;
        }
        // s.append(ptr.val);
        
        // System.out.println(s);
        String a = s.toString();
        String b = s.reverse().toString();
        return a.equals(b);
        
    }
}