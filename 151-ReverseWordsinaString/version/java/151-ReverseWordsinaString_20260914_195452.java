// Last updated: 9/14/2026, 7:54:52 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] str = s.trim().split("\\s+");
4
5        String out = "";
6        for (int i = str.length - 1; i > 0; i--) {
7            out += str[i] + " ";
8        }
9
10        return out + str[0];
11    }
12}