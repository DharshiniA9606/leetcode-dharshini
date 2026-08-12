// Last updated: 8/12/2026, 8:47:45 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        return ((n==1)||(n%2==0 && isPowerOfTwo(n/2)));
    }
}