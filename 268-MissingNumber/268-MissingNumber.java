// Last updated: 8/12/2026, 8:47:24 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        int ex_sum=n*(n+1)/2; 
        return ex_sum-sum;
    }
}