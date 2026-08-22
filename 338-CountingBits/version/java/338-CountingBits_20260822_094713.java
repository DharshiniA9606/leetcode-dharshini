// Last updated: 8/22/2026, 9:47:13 AM
1class Solution {
2    public int[] countBits(int n) {
3        int[] rez = new int[n + 1];
4
5        while (n > 0) {
6            rez[n] = bitCounter(n);
7            n--;
8        }
9
10        return rez;
11    }
12
13    private int bitCounter(int num) {
14
15        int count = 0;
16
17        while (num > 0) {
18            count += num & 1;
19            num >>= 1;
20        }
21
22        return count;
23    }
24}