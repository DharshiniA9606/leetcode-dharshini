// Last updated: 9/12/2026, 3:03:50 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        for(int i=0;i<nums.length;i++) {
4            int ind = Math.abs(nums[i]);
5            if(nums[ind] < 0) {
6                return ind;
7            }
8            nums[ind] = -nums[ind];
9        }
10        return -1;
11    }
12}