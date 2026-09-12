// Last updated: 9/12/2026, 10:58:01 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        ArrayList<int[]> res = new ArrayList<>();
4        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
5        int currStart = intervals[0][0];
6        int currEnd = intervals[0][1];
7
8        for (int i = 1; i < intervals.length; i++) {
9
10            if (intervals[i][0] <= currEnd) {
11                currEnd = Math.max(currEnd, intervals[i][1]);
12
13            } else {
14                res.add(new int[]{currStart, currEnd});
15                currStart = intervals[i][0];
16                currEnd = intervals[i][1];
17            }
18        }
19        res.add(new int[]{currStart, currEnd});
20        return res.toArray(new int[res.size()][]);
21    }
22}