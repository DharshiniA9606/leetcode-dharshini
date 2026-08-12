// Last updated: 8/12/2026, 8:42:17 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digit=0;
            if(nums[i]<10){
                digit =1;
                continue;
            }
            while(nums[i]>0){
                nums[i]/=10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }

        }
        return count;
    }
}