// Last updated: 8/12/2026, 8:42:43 AM
class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        int a=0,b=1,c=1;
        int nt;
        for(int i=3;i<=n;i++){
            nt =a+b+c;
            a=b;
            b=c;
            c=nt;
        }
        return c;
    }
}