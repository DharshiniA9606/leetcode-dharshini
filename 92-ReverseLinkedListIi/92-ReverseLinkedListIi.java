// Last updated: 8/12/2026, 8:50:20 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left==right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        for(int i=1;i<left;i++){
            prev = prev.next;
        }
        ListNode cur = prev.next;
        for(int j =0;j<right-left;j++){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next=temp;
        }
        return dummy.next;
    }
}