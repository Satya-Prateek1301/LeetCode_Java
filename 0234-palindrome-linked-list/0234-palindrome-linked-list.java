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
        
        ListNode dummy = new ListNode(0);
        ListNode copy = dummy;
        ListNode temp = head;

        while (temp != null) {
            copy.next = new ListNode(temp.val);
            copy = copy.next;
            temp = temp.next;
        }

        ListNode original = dummy.next;




        if(head == null || head.next == null){
            return true;
        }

        ListNode nextNode;
        ListNode currNode = head;
        ListNode prevNode = null;
    
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        ListNode rev = prevNode;
        temp = original;

        while(temp != null){
            if(temp.val != rev.val){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;
    }
}