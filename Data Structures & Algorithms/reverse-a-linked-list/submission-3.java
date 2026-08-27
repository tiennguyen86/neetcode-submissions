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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> values = new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            values.add(cur.val);
            cur = cur.next;
        }

        cur = head;
        int i = values.size() - 1;
        while (cur != null) {
            cur.val = values.get(i);
            i --;
            cur = cur.next;
        }
        return head;
    }
}