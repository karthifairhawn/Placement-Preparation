// 206. Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]


// The number of nodes in the list is the range [0, 5000].
// -5000 <= Node.val <= 5000

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        
        if(head == null || head.next == null)
            return head;
        
        ListNode node = head;
        while(node.next != null) {
            stack.push(node);
            node = node.next;
        }
        
        head = node;
        
        while(!stack.isEmpty()) {
            node.next = stack.peek();
            node = node.next;
            stack.pop();
        }
        
        node.next = null;
        
        return head;
    }
}