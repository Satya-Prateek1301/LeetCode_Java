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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode part1 = null;
        ListNode part2 = null;
        int idx = 0;
        while(list1 != null){
            if(idx == a - 1){
                part1 = list1;
            }
            if(idx == b){
                part2 = list1.next;
                break;
            }
            list1 = list1.next;
            idx++;
        }
        part1.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = part2;
        return head;
    }
}