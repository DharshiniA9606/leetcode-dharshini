// Last updated: 8/12/2026, 8:49:43 AM
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans = 0; 
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}