2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [0], l2 = [0]
Output: [0]

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(0); // Created a list where we return sum of two list
            ListNode curr = temp; // Cureent pointer intially at temp;
            int carry = 0; // Intially carry is 0
            
            while(l1 != null || l2 != null || carry == 1){ // Run the loop till l1 or l2 not reach null or carry still has some value present
                int sum = 0; // Intialize sum;
                if(l1 != null){ // Check for l1
                    sum += l1.val; // add value to sum
                    l1 = l1.next; // then update l1 to next node
                }
                if(l2 != null){ // Check for l2
                    sum += l2.val; // add value to sum
                    l2 = l2.next; // then update l2 to next node
                }
                
                sum += carry; // don't forgot to add carry to sum
                carry = sum / 10; // get the carry
                ListNode node = new ListNode(sum % 10); // remaining of carry will be store as new node and add to current
                curr.next = node; // current point to new node
                curr = curr.next; // update current
            }
            return temp.next; // return temp.next becuase, intial temp node is 0, as we created so, we have to ignore that
        }
    }