// Last updated: 9/12/2026, 4:28:06 PM
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