// Last updated: 8/22/2026, 1:41:44 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int cnt=0;
4        int mask=1;
5        for(int i=1;i<=32;i++){
6            if((mask&x)!=(mask&y)){
7                cnt++;
8            }
9            mask<<=1;
10        }
11
12        return cnt;
13    }
14}