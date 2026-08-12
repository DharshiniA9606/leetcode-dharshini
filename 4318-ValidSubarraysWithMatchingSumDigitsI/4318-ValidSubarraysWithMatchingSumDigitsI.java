// Last updated: 8/12/2026, 8:39:24 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            long currentsum = 0;
            for(int j=i;j<n;j++){
                currentsum += nums[j];
                long tempsum = Math.abs(currentsum);
                long lastdigit =tempsum%10;
                if(lastdigit==x){
                    long firstd = tempsum;
                    while(firstd >=10){
                        firstd /=10;
                    }
                    if(firstd==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}