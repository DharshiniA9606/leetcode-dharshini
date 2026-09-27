// Last updated: 9/27/2026, 8:07:54 PM
1class RandomizedSet {
2    private ArrayList<Integer> list;
3    private Map<Integer, Integer> map;
4
5    public RandomizedSet() {
6        list = new ArrayList<>();
7        map = new HashMap<>();
8    }
9
10    public boolean search(int val) {
11        return map.containsKey(val);
12    }
13
14    public boolean insert(int val) {
15        if (search(val)) return false;
16
17        list.add(val);
18        map.put(val, list.size() - 1);
19        return true;
20    }
21
22    public boolean remove(int val) {
23        if (!search(val)) return false;
24
25        int index = map.get(val);
26        list.set(index, list.get(list.size() - 1));
27        map.put(list.get(index), index);
28        list.remove(list.size() - 1);
29        map.remove(val);
30
31        return true;
32    }
33
34    public int getRandom() {
35        Random rand = new Random();
36        return list.get(rand.nextInt(list.size()));
37    }
38}
39
40
41
42/**
43 * Your RandomizedSet object will be instantiated and called as such:
44 * RandomizedSet obj = new RandomizedSet();
45 * boolean param_1 = obj.insert(val);
46 * boolean param_2 = obj.remove(val);
47 * int param_3 = obj.getRandom();
48 */