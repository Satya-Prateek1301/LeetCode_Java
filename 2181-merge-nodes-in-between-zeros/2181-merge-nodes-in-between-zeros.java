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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode curr2 = dummy;
        while(curr != null){
            if(curr.val == 0){
                curr = curr.next;
                int sum = 0;
                while(curr != null && curr.val != 0){
                    sum += curr.val;
                    curr = curr.next;
                }
                if(sum > 0){
                    curr2.next = new ListNode(sum);
                    curr2 = curr2.next;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}