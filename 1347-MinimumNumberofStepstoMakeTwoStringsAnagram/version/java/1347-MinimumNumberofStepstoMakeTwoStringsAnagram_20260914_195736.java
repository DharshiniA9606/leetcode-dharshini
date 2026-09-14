// Last updated: 9/14/2026, 7:57:36 PM
1public class Solution {
2    public int minSteps(String s, String t) {
3        int[] countS = new int[26];
4        int[] countT = new int[26];
5
6        for (char ch : s.toCharArray()) {
7            countS[ch - 'a']++;
8        }
9
10        for (char ch : t.toCharArray()) {
11            countT[ch - 'a']++;
12        }
13
14        int steps = 0;
15        for (int i = 0; i < 26; i++) {
16            steps += Math.abs(countS[i] - countT[i]);
17        }
18
19        return steps / 2;  
20    }
21}