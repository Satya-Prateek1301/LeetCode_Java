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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(dummy.next != null && dummy.next.next != null){
            ListNode ptr1 = dummy.next.next;
            ListNode ptr2 = dummy.next;
            int t = ptr2.val;
            ptr2.val = ptr1.val;
            ptr1.val = t;
            dummy = dummy.next.next;
        }
        return head;
    }
}