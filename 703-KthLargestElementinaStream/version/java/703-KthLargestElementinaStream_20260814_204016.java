// Last updated: 8/14/2026, 8:40:16 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int i = 0, j = 0, count = 0;
7
8        while (i < g.length && j < s.length) {
9            if (g[i] <= s[j]) {
10                count++;
11                i++;
12                j++;
13            } else if (g[i] > s[j]) {
14                j++;
15            } else {
16                i++;
17            }
18        }
19
20        return count;
21    }
22}