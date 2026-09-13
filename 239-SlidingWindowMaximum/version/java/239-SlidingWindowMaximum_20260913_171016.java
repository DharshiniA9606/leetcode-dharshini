// Last updated: 9/13/2026, 5:10:16 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4        
5        for (String word : strs) {
6            char[] chars = word.toCharArray();
7            Arrays.sort(chars);
8            String sortedWord = new String(chars);
9            
10            if (!map.containsKey(sortedWord)) {
11                map.put(sortedWord, new ArrayList<>());
12            }
13            
14            map.get(sortedWord).add(word);
15        }
16        
17        return new ArrayList<>(map.values());
18    }
19}