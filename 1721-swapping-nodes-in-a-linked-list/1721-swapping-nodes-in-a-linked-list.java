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
    public ListNode swapPairs(ListNode head, ListNode ptr1, ListNode ptr2) {
        int t = ptr2.val;
        ptr2.val = ptr1.val;
        ptr1.val = t;
        return head;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        ListNode ptr1 = head;
        for(int i = 1 ; i < k; i++){
            ptr1 = ptr1.next;
        }
        ListNode ptr2 = head;
        for(int i = 1 ; i <= count - k + 1; i++){
            ptr2 = ptr2.next;
        }
        return swapPairs(head, ptr1, ptr2);
    }
}