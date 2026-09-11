// Last updated: 9/11/2026, 9:39:12 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int n = nums.length;
4        Map<Integer,Long> map = new HashMap<>();
5        long prefixsum=0;
6        long maxSum=Long.MIN_VALUE;
7        for(int i=0;i<n;i++)
8        {
9            if(map.getOrDefault(nums[i],Long.MAX_VALUE)>prefixsum)
10            {
11                 map.put(nums[i],prefixsum);
12            }
13            prefixsum+=nums[i];
14            if(map.containsKey(nums[i]-k))
15            {
16                 maxSum=Math.max(maxSum,prefixsum-map.get(nums[i]-k));
17            }
18            if(map.containsKey(nums[i]+k))
19            {
20                 maxSum=Math.max(maxSum,prefixsum-map.get(nums[i]+k));
21            }
22        }
23        return maxSum==Long.MIN_VALUE ? 0 : maxSum;
24    }
25}