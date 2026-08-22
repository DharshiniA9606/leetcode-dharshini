// Last updated: 8/22/2026, 8:56:31 AM
1class Solution {
2    public static int hammingWeight(int n) {
3	int ones = 0;
4    	while(n!=0) {
5    		ones = ones + (n & 1);
6    		n = n>>>1;
7    	}
8    	return ones;
9}
10}