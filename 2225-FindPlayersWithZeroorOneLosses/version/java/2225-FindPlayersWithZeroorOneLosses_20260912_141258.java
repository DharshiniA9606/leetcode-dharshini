// Last updated: 9/12/2026, 2:12:58 PM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        int[] losses = new int[100001];
4
5        for (int i = 0; i < matches.length; i++) {
6            int win = matches[i][0];
7            int loss = matches[i][1];
8
9            if (losses[win] == 0) {
10                losses[win] = -1;
11            } 
12
13            if (losses[loss] == -1) {
14                losses[loss] = 1;
15            } else {
16                losses[loss]++;
17            }
18        }
19
20        List<Integer> zeroLoss = new ArrayList<>();
21        List<Integer> oneLoss = new ArrayList<>();
22
23        List<List<Integer>> result = new ArrayList<>();
24
25        for (int i = 0; i < losses.length; i++) {
26            if (losses[i] == -1) {
27                zeroLoss.add(i);
28            } else if (losses[i] == 1) {
29                oneLoss.add(i);
30            }
31        }
32
33        result.add(zeroLoss);
34        result.add(oneLoss);
35
36        return result;
37    }
38}