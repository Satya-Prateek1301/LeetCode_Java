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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null){
            int count = 0;
            ListNode temp = curr;

            while(temp != null && count < k){
                stack.push(temp);
                temp = temp.next;
                count++;
            }

            if(count < k){
                prev.next = curr;
                break;
            }

            while(!stack.isEmpty()){
                prev.next = stack.pop();
                prev = prev.next;
            }
            curr = temp;
        }
        prev.next = curr;
        return dummy.next;
    }
}