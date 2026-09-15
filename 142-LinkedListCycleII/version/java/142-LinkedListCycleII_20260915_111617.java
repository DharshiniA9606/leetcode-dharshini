// Last updated: 9/15/2026, 11:16:17 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast != null && fast.next != null){
17            slow = slow.next;
18            fast = fast.next.next;
19            if(slow == fast){
20                break;
21            }   
22        }
23
24        if(fast == null || fast.next == null){
25            return null;
26        }
27        
28        ListNode slow2 = head;
29        while(slow2 != slow){
30            slow2 = slow2.next;
31            slow = slow.next;
32
33        }
34        return slow;
35    }
36}