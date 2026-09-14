// Last updated: 9/14/2026, 7:59:06 PM
1
2class Solution {
3    public int sumDistance(int[] nums, String s, int d) {
4        
5        int n = nums.length;
6        long temp[] = new long[n];
7        for (int i = 0; i < s.length(); i++) {
8            if(s.charAt(i) == 'R'){
9                temp[i] = (long)nums[i] + d;
10            }else{
11                temp[i] = (long)nums[i] - d;
12            }
13        }
14
15        Arrays.sort(temp);
16
17        long res = 0;
18        int j = n - 1;
19
20        for (int i = 0; i < n; i++) {
21            if (j - i <= 0) {
22                break;
23            }
24            long diff = Math.abs(temp[j] - temp[i]);
25            long prod = diff * (j - i);
26            res += prod;
27            res %= 1000000007;
28            j--;
29        }
30
31        return (int) res;
32    }
33}