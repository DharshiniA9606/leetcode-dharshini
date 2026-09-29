// Last updated: 9/29/2026, 8:31:15 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if(head == null || head.next == null){
14            return;
15        }
16        ListNode slow = head;
17        ListNode fast = head;
18        while(fast.next != null && fast.next.next != null){
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        ListNode second = slow.next;
23        slow.next = null;
24        ListNode prev = null;
25        while(second != null){
26            ListNode next = second.next;
27            second.next = prev;
28            prev = second;
29            second = next;
30        }
31        second = prev;
32        ListNode first = head;
33        while(second != null){
34            ListNode temp1 = first.next;
35            ListNode temp2 = second.next;
36            first.next = second;
37            second.next = temp1;
38            first = temp1;
39            second = temp2;
40        }
41    }
42}