// Last updated: 8/12/2026, 8:47:06 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        return ((n==1)||(n%3==0 && isPowerOfThree(n/3)));
    }
}