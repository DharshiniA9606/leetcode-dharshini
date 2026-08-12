// Last updated: 8/12/2026, 8:48:16 AM
class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1||n==7){
            return true;
        }
        else if(n<10){
            return false;
        }
        else{
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n = sum;
            return isHappy(sum);
        }
        
    }
}