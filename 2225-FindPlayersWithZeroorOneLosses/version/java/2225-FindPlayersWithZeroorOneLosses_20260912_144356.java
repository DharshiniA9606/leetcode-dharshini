// Last updated: 9/12/2026, 2:43:56 PM
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3        if(a == e || b == f) {
4            if(a == e && a == c && ((d-b) * (d-f) < 0)) return 2;
5            if(b == f && b == d && ((c-a) * (c-e) < 0)) return 2;
6            return 1;
7        }
8        if(Math.abs(c - e) == Math.abs(d - f)) {
9            if(Math.abs(c - a) == Math.abs(d - b) && Math.abs(e - a) == Math.abs(f - b) && ((b-f) * (b-d) < 0))  return 2;
10            return 1;
11        }
12        return 2;
13    }
14}