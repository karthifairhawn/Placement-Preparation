// 19. Remove Nth Node From End of List

// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// Input: head = [1,2], n = 1
// Output: [1]


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        
        //Count number of nodes
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        
        temp=head;
        for(int i=0;i<c-n-1;i++)
        {
            temp=temp.next;
        }
        
        //Remove first Node
        if(c-n==0)
            head=head.next;
        else
            temp.next=temp.next.next;
        return head;
    }
    }