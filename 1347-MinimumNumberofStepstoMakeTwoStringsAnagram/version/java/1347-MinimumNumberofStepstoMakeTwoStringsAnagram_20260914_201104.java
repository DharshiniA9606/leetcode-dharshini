// Last updated: 9/14/2026, 8:11:04 PM
1class Solution {
2    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
3	Map<Integer,Integer> sums = new HashMap<>();
4	int count = 0;
5	for(int i=0; i<A.length;i++) {
6		for(int j=0;j<B.length;j++){
7			int sum = A[i]+B[j];
8			if(sums.containsKey(sum)) {
9				sums.put(sum, sums.get(sum)+1);
10			} else {
11				sums.put(sum, 1);
12			}
13		}
14	}
15	for(int k=0; k<A.length;k++) {
16		for(int z=0;z<C.length;z++){
17			int sum = -(C[k]+D[z]);
18			if(sums.containsKey(sum)) {
19				count+=sums.get(sum);
20			}
21		}
22	}
23	return count;
24}
25}