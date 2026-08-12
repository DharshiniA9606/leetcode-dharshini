// Last updated: 8/12/2026, 8:51:37 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
    }
}