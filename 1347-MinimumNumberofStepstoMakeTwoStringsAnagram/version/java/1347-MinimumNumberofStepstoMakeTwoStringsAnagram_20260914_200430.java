// Last updated: 9/14/2026, 8:04:30 PM
1class Solution {
2    public String countAndSay(int n) {
3        String current = "1";
4
5        for (int iteration = 2; iteration <= n; iteration++) {
6            StringBuilder next = new StringBuilder();
7            int i = 0;
8            while (i < current.length()) {
9                char digit = current.charAt(i);
10                int count = 0;
11                while (i < current.length() && current.charAt(i) == digit) {
12                    count++;
13                    i++;
14                }
15
16                next.append(count);
17                next.append(digit);
18            }
19
20            current = next.toString();
21        }
22
23        return current;
24    }
25}