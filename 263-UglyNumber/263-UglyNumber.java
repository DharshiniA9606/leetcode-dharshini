// Last updated: 8/12/2026, 8:47:28 AM
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        return n == 1;
    }
}