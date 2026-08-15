// Last updated: 8/15/2026, 7:24:44 PM
1class Solution {
2      public String countOfAtoms(String formula) {
3        Stack<Map<String, Integer>> stack = new Stack<>();
4        stack.push(new HashMap<>());
5        int len = formula.length();
6
7        for (int i = 0; i < len; ) {
8            if (formula.charAt(i) == '(') {
9                stack.push(new HashMap<>());
10                i++;
11            } else if (formula.charAt(i) == ')') {
12                Map<String, Integer> top = stack.pop();
13                i++;
14                int start = i;
15                while (i < len && Character.isDigit(formula.charAt(i))) i++;
16                int multiplier = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
17                for (String key : top.keySet()) {
18                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + top.get(key) * multiplier);
19                }
20            } else {
21                int start = i;
22                i++;
23                while (i < len && Character.isLowerCase(formula.charAt(i))) i++;
24                String element = formula.substring(start, i);
25                start = i;
26                while (i < len && Character.isDigit(formula.charAt(i))) i++;
27                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
28                stack.peek().put(element, stack.peek().getOrDefault(element, 0) + count);
29            }
30        }
31
32        Map<String, Integer> result = stack.pop();
33        List<String> elements = new ArrayList<>(result.keySet());
34        Collections.sort(elements);
35        StringBuilder sb = new StringBuilder();
36        for (String element : elements) {
37            sb.append(element);
38            int count = result.get(element);
39            if (count > 1) sb.append(count);
40        }
41        return sb.toString();
42    }
43}