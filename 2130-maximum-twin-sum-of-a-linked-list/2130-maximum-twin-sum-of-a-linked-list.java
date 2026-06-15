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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        int n = list.size();
        for(int i = 0 ; i < n ; i++){
            int sum = list.get(i) + list.get(n - 1  - i);
            max = Math.max(max, sum);
        }
        return max;
    }
}