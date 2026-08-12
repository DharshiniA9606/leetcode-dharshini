// Last updated: 8/12/2026, 8:51:27 AM
class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int res = dividend/divisor;
        return (int)res;
    }
}