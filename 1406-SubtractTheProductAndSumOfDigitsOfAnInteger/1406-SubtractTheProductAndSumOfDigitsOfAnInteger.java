// Last updated: 8/12/2026, 8:42:20 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product = 1;
        while(n>0){
            int digit = n%10;
            sum +=digit;
            product *= digit;
            n/=10;
        }
        int res = product - sum;
        return res;
    }
}