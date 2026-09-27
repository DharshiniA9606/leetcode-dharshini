// Last updated: 9/27/2026, 8:44:54 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int ie =0;
4        Map<Long, Integer> pc = new HashMap<>();
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]==nums[i+1]){
7                ie++;
8            }
9            else{
10                int min=Math.min(nums[i],nums[i+1]);
11                int max=Math.max(nums[i],nums[i+1]);
12                long key = ((long)min<<32)|(max & 0xFFFFFFFFL);
13                pc.put(key,pc.getOrDefault(key,0)+1);
14            }
15        }
16        int mg = 0;
17        for(int count: pc.values()){
18            if(count>mg){
19                mg = count;
20            }
21        }
22        return ie+mg;
23    }
24}