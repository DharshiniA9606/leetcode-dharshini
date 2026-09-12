// Last updated: 9/12/2026, 4:28:07 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int valid =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int even=0;
            int odd=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
                if((long)even*b<=(long)odd*a){
                    valid++;
                }
            }
        }
        return valid;
    }
}