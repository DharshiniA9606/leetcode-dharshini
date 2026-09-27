// Last updated: 9/27/2026, 9:04:24 AM
1class Solution {
2    public int maxSubarray(int[] nums) {
3        int maxLength = 0;
4        int left = 0;
5        Map<Integer, Integer> window = new HashMap<>();
6        for (int right = 0; right < nums.length; right++) {
7            int current = nums[right];
8            window.put(current, window.getOrDefault(current, 0) + 1);
9            while (hasViolation(window, current)) {
10                int leftVal = nums[left];
11                if (window.get(leftVal) == 1) {
12                    window.remove(leftVal);
13                } else {
14                    window.put(leftVal, window.get(leftVal) - 1);
15                }
16                left++;
17            }
18            maxLength = Math.max(maxLength, right - left + 1);
19        }
20        return maxLength;
21    }
22    private boolean hasViolation(Map<Integer, Integer> window, int x) {
23        for (int y : window.keySet()) {
24            int z1 = x - y;
25            if (window.containsKey(z1)) {
26                if (y != z1 && window.get(z1) >= 1) return true;
27                if (y == z1 && window.get(y) >= 2) return true;
28            }
29            int z2 = x + y;
30            if (window.containsKey(z2)) {
31                if (x != y && x != z2 && y != z2) return true;
32                if (x == y && window.get(x) >= 2) return true;
33                if (x == z2 && window.get(x) >= 2) return true; 
34                if (y == z2 && window.get(y) >= 2) return true; 
35            }
36        }
37        return false;
38    }
39}