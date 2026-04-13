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
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null && temp.next != null){
            int a = temp.val;
            int b = temp.next.val;
            int c = gcd(a,b);
            prev = temp.next;
            ListNode newNode = new ListNode(c);
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next = prev;
            temp = prev;
        }
        return head;
    }
}