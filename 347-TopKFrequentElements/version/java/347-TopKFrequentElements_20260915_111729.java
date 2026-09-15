// Last updated: 9/15/2026, 11:17:29 AM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        Map<Integer, Integer> frequency = new HashMap<>();
6
7        for (int num : nums) {
8            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
9        }
10
11        List<Integer> elements = new ArrayList<>(frequency.keySet());
12
13        elements.sort((a, b) -> frequency.get(b) - frequency.get(a));
14
15        int[] result = new int[k];
16
17        for (int i = 0; i < k; i++) {
18            result[i] = elements.get(i);
19        }
20
21        return result;
22    }
23}