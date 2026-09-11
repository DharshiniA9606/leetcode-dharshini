// Last updated: 9/11/2026, 9:41:52 AM
1class Solution {
2    public int maximumSetSize(int[] nums1, int[] nums2) {
3        Set<Integer> s1 = new HashSet(); 
4        Set<Integer> s2 = new HashSet();
5        Set<Integer> s3 = new HashSet(); 
6        
7        for (int num: nums1){
8            s1.add(num);
9            s3.add(num);
10        } 
11        for (int num: nums2) {
12            s2.add(num);
13            s3.add(num);
14        } 
15          
16        return Math.min(Math.min(s1.size(), nums1.length/2) + 
17                        Math.min(s2.size(), nums2.length/2), s3.size());                            
18    }
19}