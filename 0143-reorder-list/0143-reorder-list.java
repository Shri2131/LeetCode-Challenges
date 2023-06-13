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
    public void reorderList(ListNode head) {
        //Null or 1 Element check condition
        if(head==null||head.next==null){
            return;
        }

        //Finding Middle element to divide into two linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //Reversing the second half of the list
        ListNode newNode = reverseList(slow.next);

        //Breaking from the middle
        slow.next=null;

        //FirstHalf of the list
        ListNode curr = head;

        //Second half pointer
        ListNode dummy = newNode;

        //Merging according to the condition
        while(head!=null && dummy!=null){
            ListNode temp = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            curr=temp;
            dummy=temp2;
        }
    }

    //Reverse the linkedList
    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
         
        return prev;
    }
}