// Last updated: 8/12/2026, 8:39:20 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int d = 0;
        int sq=0;
        while(n>0){
            int digit = n%10;
            d = d+digit;
            sq += (int)Math.pow(digit,2);
            n/=10;
        }
        if((sq-d)>=50){
            return true;
        }
        else{
            return false;
        }
    }
}