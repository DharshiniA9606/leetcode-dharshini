// Last updated: 9/12/2026, 10:54:04 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        
5        int prefixSum = 0; 
6        hm.put(0, 1); 
7
8        int noOfSubArrayPossible = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11            prefixSum += nums[i];              
12            
13            int remove = prefixSum - k;     
14            if(hm.containsKey(remove)){         
15                noOfSubArrayPossible += hm.get(remove);
16            }
17            
18            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1); 
19        }
20        return noOfSubArrayPossible;
21    }
22}