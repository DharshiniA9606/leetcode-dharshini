// Last updated: 8/12/2026, 8:38:51 AM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
     int[] disC = new int[101];
        for(int d:discounts){
            disC[d]++;
        }
        int[] priceC = new int[100001];
        for(int p:prices){
            priceC[p]++;
        }
        double tot  = 0;
        int didx = 100;
        for(int pVal = 100000;pVal>=1;pVal--){
            while(priceC[pVal]>0){
                while(didx>=1 && disC[didx]==0){
                    didx--;
                }
                if(didx>=1){
                    tot +=pVal*(100.0-didx)/100.0;
                    disC[didx]--;
                }
                else{
                    tot +=pVal;
                    
                }
                priceC[pVal]--;
            }
        }
        return tot;
    }
    
}