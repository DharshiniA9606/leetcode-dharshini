// Last updated: 8/12/2026, 8:39:06 AM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long mod=1_000_000_007;
        long avail = k;
        long tot =0;
        for(int num:nums){
            if(avail<num){
                long deflit=num-avail;
                long ops = (deflit+k-1)/k;
                tot +=ops;
                avail+=ops*k;
                
            }
            avail-=num;
            
        }
        long n=tot%mod;
        long totcost=(n*(n+1))%mod;
        totcost = (totcost*500000004)%mod;
        return (int)totcost;
    }
}