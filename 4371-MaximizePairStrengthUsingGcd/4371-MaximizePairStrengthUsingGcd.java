// Last updated: 8/12/2026, 8:38:55 AM
class Solution {
    public long maxPairStrength(int[] nums) {
        long maxstrength=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                long a= nums[i];
                long b= nums[j];
                long g = gcd(a,b);
                long strength = (a*b)/(g*g);
                if(strength>maxstrength){
                    maxstrength=strength;
                }
            }
        }
        return maxstrength;
    }
    private long gcd(long a, long b){
        return b==0?a:gcd(b,a%b);
    }
}