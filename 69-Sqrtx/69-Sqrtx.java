// Last updated: 8/12/2026, 8:50:43 AM
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        long r = x;
        while(r * r > x) {
            r=(r+x/r)/2;
        }
        return(int) r;

        
        
    }
}