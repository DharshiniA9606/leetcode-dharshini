// Last updated: 9/13/2026, 5:09:30 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] a, int k) {		
3		if (a == null || k <= 0) {
4			return new int[0];
5		}
6		int n = a.length;
7		int[] r = new int[n-k+1];
8		int ri = 0;
9		Deque<Integer> q = new ArrayDeque<>();
10		for (int i = 0; i < a.length; i++) {
11			while (!q.isEmpty() && q.peek() < i - k + 1) {
12				q.poll();
13			}
14			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
15				q.pollLast();
16			}
17			q.offer(i);
18			if (i >= k - 1) {
19				r[ri++] = a[q.peek()];
20			}
21		}
22		return r;
23	}
24}