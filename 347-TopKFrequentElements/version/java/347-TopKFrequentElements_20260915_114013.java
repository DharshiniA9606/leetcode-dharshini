// Last updated: 9/15/2026, 11:40:13 AM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15public class Solution {
16    public Node copyRandomList(Node head) {
17        if (head == null) return null;
18        
19        HashMap<Node, Node> oldToNew = new HashMap<>();
20        
21        Node curr = head;
22        while (curr != null) {
23            oldToNew.put(curr, new Node(curr.val));
24            curr = curr.next;
25        }
26        
27        curr = head;
28        while (curr != null) {
29            oldToNew.get(curr).next = oldToNew.get(curr.next);
30            oldToNew.get(curr).random = oldToNew.get(curr.random);
31            curr = curr.next;
32        }
33        
34        return oldToNew.get(head);
35    }
36}