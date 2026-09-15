// Last updated: 9/15/2026, 11:13:39 AM
1class Node {
2    public int key;
3    public int val;
4    public Node next;
5    public Node prev;
6
7    public Node(int key, int val) {
8        this.key = key;
9        this.val = val;
10        next = null;
11        prev = null;
12    }
13}
14
15class LRUCache {
16    private Map<Integer, Node> m;
17    private Node head;
18    private Node tail;
19    private int size;
20
21    public LRUCache(int capacity) {
22        size = capacity;
23        m = new HashMap<>();
24        head = new Node(-1, -1);
25        tail = new Node(-1, -1);
26        head.next = tail;
27        tail.prev = head;
28    }
29
30    private void deleteNode(Node p) {
31        Node pre = p.prev;
32        Node nex = p.next;
33        pre.next = nex;
34        nex.prev = pre;
35    }
36
37    private void addNode(Node newnode) {
38        Node temp = head.next;
39        head.next = newnode;
40        newnode.prev = head;
41        newnode.next = temp;
42        temp.prev = newnode;
43    }
44
45    public int get(int key) {
46        if (!m.containsKey(key))
47            return -1;
48
49        Node p = m.get(key);
50        deleteNode(p);
51        addNode(p);
52        m.put(key, head.next);
53        return head.next.val;
54    }
55
56    public void put(int key, int value) {
57        if (m.containsKey(key)) {
58            Node c = m.get(key);
59            deleteNode(c);
60            c.val = value;
61            addNode(c);
62            m.put(key, head.next);
63        } else {
64            if (m.size() == size) {
65                Node prev = tail.prev;
66                deleteNode(prev);
67                Node l = new Node(key, value);
68                addNode(l);
69                m.remove(prev.key);
70                m.put(key, head.next);
71            } else {
72                Node l = new Node(key, value);
73                addNode(l);
74                m.put(key, head.next);
75            }
76        }
77    }
78}
79
80// LRUCache cache = new LRUCache(capacity);
81// int value = cache.get(key);
82// cache.put(key, value);