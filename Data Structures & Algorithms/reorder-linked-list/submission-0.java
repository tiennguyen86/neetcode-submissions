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
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Nếu như thế thì thoát vòng if sẽ bay màu 
        // if (fast == null) {
        //     ListNode nuaSau = slow.next
        //     slow.next = null;
        // }
        ListNode nuaSau = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode cur = nuaSau;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        ListNode l1 = head;
        ListNode l2 = prev;

        // Nửa 2 lun bằng hoặc ngắn hơn nửa 1 nên ta vộc nửa 2
        while (l2 != null) {
            ListNode temp1 = l1.next;
            ListNode temp2 = l2.next;

            l1.next = l2;
            l2.next = temp1;


            l1 = temp1;
            l2 = temp2;
        }

        
    }
}
