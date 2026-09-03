// Last updated: 9/3/2026, 9:57:21 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int mn = Integer.MAX_VALUE;
4        int count = 0;
5
6        for (int x : nums1) {
7            mn = Math.min(mn, x);
8            if (x % 2 == 1) count++;
9        }
10
11        return mn % 2 == 1 || count == 0;
12    }
13}