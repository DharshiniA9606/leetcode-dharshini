// Last updated: 8/14/2026, 8:43:27 PM
1class NumArray {
2    private int[] pre;
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        pre = new int[n+1];
6
7        pre[0] = 0;
8        for(int i = 1;i<=n;i++){
9            pre[i] = pre[i-1] + nums[i-1];
10        }    
11    }
12    
13    public int sumRange(int left, int right) {
14        return pre[right+1] - pre[left];
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */