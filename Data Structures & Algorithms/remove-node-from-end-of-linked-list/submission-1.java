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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode bucGiang = new ListNode(-1);
        bucGiang.next = head;

        ListNode rua = bucGiang;
        ListNode tho = bucGiang;

        for (int i = 0; i < n; i ++) {
            tho = tho.next;
        }

        while (tho.next != null) {
            rua = rua.next;
            tho = tho.next;
        }

        rua.next = rua.next.next;
        return bucGiang.next;

    }
}
