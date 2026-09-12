// Last updated: 9/12/2026, 10:59:29 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        Set<Character> charSet = new HashSet<>();
6        int left = 0;
7        
8        for (int right = 0; right < n; right++) {
9            if (!charSet.contains(s.charAt(right))) {
10                charSet.add(s.charAt(right));
11                maxLength = Math.max(maxLength, right - left + 1);
12            } else {
13                while (charSet.contains(s.charAt(right))) {
14                    charSet.remove(s.charAt(left));
15                    left++;
16                }
17                charSet.add(s.charAt(right));
18            }
19        }
20        
21        return maxLength;
22    }
23}