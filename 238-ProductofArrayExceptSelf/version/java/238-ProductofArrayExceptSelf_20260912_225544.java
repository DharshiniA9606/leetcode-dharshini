// Last updated: 9/12/2026, 10:55:44 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0], min = nums[0], ans = nums[0];
4        int n = nums.length;
5        for (int i = 1; i < n; i++) {
6            if (nums[i] < 0){
7                int temp = max;
8                max = min;
9                min = temp;
10            }
11            max = Math.max(nums[i], max * nums[i]);
12            min = Math.min(nums[i], min * nums[i]);
13            ans = Math.max(ans, max);
14        }
15        
16        return ans;
17
18    }
19}