// Last updated: 9/12/2026, 3:02:49 PM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int left[] = new int[n];
5        int right[] = new int[n];
6        int ans = 0;
7
8        left[0] = height[0];
9        for(int i=1; i<n; i++)
10            left[i] = Math.max(left[i-1], height[i]);
11
12        right[n-1] = height[n-1];
13        for(int i=n-2; i>=0; i--)
14            right[i] = Math.max(right[i+1], height[i]);
15
16       
17        for(int i=0; i<n-1; i++)
18            ans += (Math.min(left[i], right[i]) - height[i]);
19
20        return ans;
21    }
22}