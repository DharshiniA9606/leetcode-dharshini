// Last updated: 8/12/2026, 8:47:29 AM
class Solution {
    public int addDigits(int num) {
        
        while(num>9){
            int res=0;
            while(num>0){
                res += (num%10);
            num/=10;}
            num= res;       
        }
        return num;
    }
}