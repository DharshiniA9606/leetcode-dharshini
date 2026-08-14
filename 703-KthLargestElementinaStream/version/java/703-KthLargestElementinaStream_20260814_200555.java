// Last updated: 8/14/2026, 8:05:55 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int i : stones){
5            pq.offer(i);
6        }
7        while(pq.size() > 1){
8            int i = pq.poll();
9            int j = pq.poll(); 
10
11            if(i != j){
12                pq.offer(i-j);
13            }
14        }
15        return pq.size() == 0 ? 0 : pq.poll();
16    }
17}